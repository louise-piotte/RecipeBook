package app.recipebook

import android.database.sqlite.SQLiteDatabase
import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import app.recipebook.data.local.db.RecipeBookDatabase
import app.recipebook.data.local.db.supportedRecipeBookMigrations
import app.recipebook.data.local.recipes.RecipeRepository
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.flow.first
import app.recipebook.data.local.settings.AppLanguageStore
import app.recipebook.domain.model.AppLanguage
import app.recipebook.domain.model.LibrarySettings
import app.recipebook.data.local.recipes.SeedLibraryData
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import java.io.File
import java.util.UUID

@RunWith(AndroidJUnit4::class)
class RecipeDatabaseMigrationTest {
    @Test fun historicalVersion5PreservesRecipesAndRelations() = verifyMigration(5, false)
    @Test fun installedVersion5VariantPreservesRecipesAndRelations() = verifyMigration(5, true)
    @Test fun version6PreservesRecipesAndRelations() = verifyMigration(6, false)
    @Test fun version7PreservesRecipesAndRelations() = verifyMigration(7, true)

    private fun verifyMigration(version: Int, hasLinks: Boolean) = runBlocking {
        val instrumentation = InstrumentationRegistry.getInstrumentation()
        val context = instrumentation.targetContext
        val directory = File(context.cacheDir, "migration-test-${UUID.randomUUID()}").apply { mkdirs() }
        val file = File(directory, "legacy.db")
        try {
            createLegacyDatabase(file, version, hasLinks)
            Room.databaseBuilder(context, RecipeBookDatabase::class.java, file.absolutePath)
                .addMigrations(*supportedRecipeBookMigrations).build().useDatabase { db ->
                    val sql = db.openHelper.writableDatabase
                    assertEquals(10, sql.version)
                    sql.query("PRAGMA table_info(recipe_ingredient_lines)").use { columns ->
                        val names = buildSet { while (columns.moveToNext()) add(columns.getString(columns.getColumnIndexOrThrow("name"))) }
                        assertTrue(names.contains("ingredientFormId"))
                        assertTrue(names.contains("ingredientAliasHint"))
                        assertTrue(names.contains("packageAmountJson"))
                    }
                    sql.query("PRAGMA foreign_key_check").use { assertEquals(0, it.count) }
                    val repository = RecipeRepository(recipeDao = db.recipeDao(), libraryMetadataDao = db.libraryMetadataDao(),
                        librarySettingsDao = db.librarySettingsDao(),
                        seedLibrary = SeedLibraryData(settings = LibrarySettings(language = AppLanguage.EN, driveSyncEnabled = false)))
                    // Follow the startup resolution path against a real migrated legacy database.
                    val languageStore = AppLanguageStore(context)
                    val previousLanguage = languageStore.language.first()
                    try {
                        assertNull(db.librarySettingsDao().getById())
                        languageStore.setLanguage(AppLanguage.FR)
                        repeat(2) {
                            languageStore.setLanguage(repository.getLibrarySettings(languageStore.language.first()).language)
                            assertEquals(AppLanguage.FR, languageStore.language.first())
                        }
                        repository.updateLibrarySettings(LibrarySettings(language = AppLanguage.EN, driveSyncEnabled = false), notifyMutation = false)
                        languageStore.setLanguage(repository.getLibrarySettings(languageStore.language.first()).language)
                        assertEquals(AppLanguage.EN, languageStore.language.first())
                    } finally { languageStore.setLanguage(previousLanguage) }
                    val recipe = requireNotNull(repository.getRecipeById("legacy-0"))
                    assertEquals("Legacy recipe 0", recipe.languages.en.title)
                    assertEquals("/private/fixture/photo.png", recipe.photos.single().localPath)
                    val ingredient = recipe.ingredients.single()
                    assertNull(ingredient.ingredientFormId)
                    assertNull(ingredient.ingredientAliasHint)
                    assertNull(ingredient.packageAmount)
                    assertEquals(1.5, requireNotNull(ingredient.quantity), 0.000001)
                    assertEquals("tasses", ingredient.unit)
                    assertEquals("haché", ingredient.preparation.fr)
                    assertEquals("haché", ingredient.preparation.en)
                    assertEquals("keep this note", ingredient.notes.en)
                    assertTrue(ingredient.optional)
                    assertEquals("Sauce", ingredient.group)
                    assertEquals("legacy-sub", ingredient.substitutions.single().id)
                    assertEquals(listOf("legacy-tag"), recipe.tagIds)
                    assertEquals(listOf("legacy-collection"), recipe.collectionIds)
                    if (hasLinks) assertEquals("legacy-1", recipe.recipeLinks.single().targetRecipeId)
                    else assertTrue(recipe.recipeLinks.isEmpty())
                    assertNotNull(db.libraryMetadataDao().getAny())
                    val seed = app.recipebook.data.local.recipes.SeedLibraryData(recipes = listOf(repository.createBlankRecipe().copy(id = "must-not-be-seeded")))
                    RecipeRepository(recipeDao = db.recipeDao(), libraryMetadataDao = db.libraryMetadataDao(), seedLibrary = seed).seedBundledLibraryIfMissing()
                    assertNull(repository.getRecipeById("must-not-be-seeded"))
                    sql.query("SELECT COUNT(*) FROM recipes").use { it.moveToFirst(); assertEquals(3, it.getInt(0)) }
                    sql.query("SELECT COUNT(*) FROM contextual_substitution_rules").use {
                        it.moveToFirst(); assertEquals(if (version > 5 || hasLinks) 1 else 0, it.getInt(0))
                    }
                }
            // A second open validates the stored Room identity and does not reseed or normalize again.
            Room.databaseBuilder(context, RecipeBookDatabase::class.java, file.absolutePath)
                .addMigrations(*supportedRecipeBookMigrations).build().useDatabase { db ->
                    assertNotNull(db.recipeDao().getById("legacy-0"))
                }
        } finally { directory.deleteRecursively() }
    }

    @Test fun unsupportedVersionFailsWithoutDeletingExistingRows() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val directory = File(context.cacheDir, "migration-test-${UUID.randomUUID()}").apply { mkdirs() }
        val file = File(directory, "legacy.db")
        try {
            createLegacyDatabase(file, 4, false)
            val room = Room.databaseBuilder(context, RecipeBookDatabase::class.java, file.absolutePath)
                .addMigrations(*supportedRecipeBookMigrations).build()
            try {
                room.openHelper.writableDatabase
                fail("Unsupported version should fail safely")
            } catch (_: IllegalStateException) { } finally { room.close() }
            SQLiteDatabase.openDatabase(file.absolutePath, null, SQLiteDatabase.OPEN_READONLY).use { db ->
                assertEquals(4, db.version)
                db.rawQuery("SELECT COUNT(*) FROM recipes", null).use { it.moveToFirst(); assertEquals(3, it.getInt(0)) }
            }
        } finally { directory.deleteRecursively() }
    }

    private fun createLegacyDatabase(file: File, version: Int, hasLinks: Boolean) {
        val instrumentation = InstrumentationRegistry.getInstrumentation()
        val schema = instrumentation.context.assets.open("room-legacy-fixture.sql").bufferedReader().use { it.readText() }
        SQLiteDatabase.openOrCreateDatabase(file, null).use { db ->
            db.setForeignKeyConstraintsEnabled(true)
            schema.lineSequence().filterNot { it.startsWith("--") }.joinToString("\n").split(';')
                .map(String::trim).filter(String::isNotEmpty).forEach { statement ->
                    val omitContext = version <= 5 && !hasLinks && statement.contains("contextual_substitution_rules")
                    val omitLinks = !hasLinks && statement.contains("recipe_links")
                    if (!omitContext && !omitLinks) db.execSQL(statement)
                }
            repeat(3) { index ->
                db.execSQL("""INSERT INTO recipes (id,createdAt,updatedAt,titleFr,titleEn,descriptionFr,descriptionEn,instructionsFr,instructionsEn,notesFr,notesEn,photosJson,attachmentsJson)
                    VALUES (?, '2026-01-01', '2026-01-02', 'Recette', ?, '', '', '', '', '', '', ?, '[]')""",
                    arrayOf("legacy-$index", "Legacy recipe $index", "[{\"id\":\"legacy-photo\",\"localPath\":\"/private/fixture/photo.png\"}]"))
            }
            db.execSQL("""INSERT INTO recipe_ingredient_lines (id,recipeId,position,originalText,quantity,unit,ingredientName,preparation,optional,notes,groupName)
                VALUES ('legacy-line','legacy-0',0,'1,5 tasses',1.5,'tasses','sugar','haché',1,'keep this note','Sauce')""")
            db.execSQL("""INSERT INTO recipe_ingredient_line_substitutions (id,ingredientLineId,position,substitutionRuleId,isPreferred,createdAt,updatedAt)
                VALUES ('legacy-sub','legacy-line',0,'rule',1,'now','now')""")
            db.execSQL("INSERT INTO tags VALUES ('legacy-tag','Famille','Family','family','OTHER')")
            db.execSQL("INSERT INTO recipe_tag_cross_refs VALUES ('legacy-0','legacy-tag',0)")
            db.execSQL("INSERT INTO collections VALUES ('legacy-collection','Famille','Family',NULL,NULL,'[]',NULL)")
            db.execSQL("INSERT INTO recipe_collection_cross_refs VALUES ('legacy-0','legacy-collection',0)")
            if (hasLinks) db.execSQL("INSERT INTO recipe_links VALUES ('legacy-link','legacy-0','legacy-1','SAUCE',NULL,NULL,0)")
            if (version > 5 || hasLinks) db.execSQL("""INSERT INTO contextual_substitution_rules
                (id,fromIngredientRefId,toIngredientRefId,conversionType,allowedDishTypesJson,excludedDishTypesJson,allowedIngredientRolesJson,excludedIngredientRolesJson,allowedCookingMethodsJson,confidence,riskLevel,updatedAt)
                VALUES ('legacy-rule','a','b','RATIO','[]','[]','[]','[]','[]','TESTED','SAFE','now')""")
            db.version = version
        }
    }
}

private inline fun <T> RecipeBookDatabase.useDatabase(block: (RecipeBookDatabase) -> T): T =
    try { block(this) } finally { close() }

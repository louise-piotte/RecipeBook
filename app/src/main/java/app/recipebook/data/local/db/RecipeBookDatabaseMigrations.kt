package app.recipebook.data.local.db

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

internal val supportedRecipeBookMigrations: Array<Migration> =
    arrayOf(PreserveLegacyRecipeLibrary(5), PreserveLegacyRecipeLibrary(6), PreserveLegacyRecipeLibrary(7))

/** Upgrades the supported legacy schemas without discarding recipes or managed media. */
private class PreserveLegacyRecipeLibrary(version: Int) : Migration(version, 8) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("""CREATE TABLE IF NOT EXISTS `recipe_links` (`id` TEXT NOT NULL, `recipeId` TEXT NOT NULL, `targetRecipeId` TEXT NOT NULL, `linkType` TEXT NOT NULL, `labelFr` TEXT, `labelEn` TEXT, `position` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`recipeId`) REFERENCES `recipes`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )""")
        db.execSQL("""CREATE UNIQUE INDEX IF NOT EXISTS `index_recipe_links_recipeId_position` ON `recipe_links` (`recipeId`, `position`)""")
        db.execSQL("""CREATE INDEX IF NOT EXISTS `index_recipe_links_recipeId` ON `recipe_links` (`recipeId`)""")
        db.execSQL("""CREATE INDEX IF NOT EXISTS `index_recipe_links_targetRecipeId` ON `recipe_links` (`targetRecipeId`)""")
        db.execSQL("""CREATE TABLE IF NOT EXISTS `contextual_substitution_rules` (`id` TEXT NOT NULL, `fromIngredientRefId` TEXT NOT NULL, `toIngredientRefId` TEXT NOT NULL, `conversionType` TEXT NOT NULL, `ratio` REAL, `offset` REAL, `allowedDishTypesJson` TEXT NOT NULL, `excludedDishTypesJson` TEXT NOT NULL, `allowedIngredientRolesJson` TEXT NOT NULL, `excludedIngredientRolesJson` TEXT NOT NULL, `allowedCookingMethodsJson` TEXT NOT NULL, `confidence` TEXT NOT NULL, `riskLevel` TEXT NOT NULL, `notesFr` TEXT, `notesEn` TEXT, `warningTextFr` TEXT, `warningTextEn` TEXT, `updatedAt` TEXT NOT NULL, PRIMARY KEY(`id`))""")
        db.execSQL("""CREATE INDEX IF NOT EXISTS `index_contextual_substitution_rules_fromIngredientRefId` ON `contextual_substitution_rules` (`fromIngredientRefId`)""")
        db.execSQL("""CREATE INDEX IF NOT EXISTS `index_contextual_substitution_rules_toIngredientRefId` ON `contextual_substitution_rules` (`toIngredientRefId`)""")
        // The installed version-5 variant already has the later tables; CREATE IF NOT EXISTS
        // preserves those rows while also supporting the historical version-5/6 schemas.
        db.execSQL("CREATE TEMP TABLE migration_line_substitutions AS SELECT * FROM recipe_ingredient_line_substitutions")
        db.execSQL("""CREATE TABLE IF NOT EXISTS `recipe_ingredient_lines_v8` (`id` TEXT NOT NULL, `recipeId` TEXT NOT NULL, `position` INTEGER NOT NULL, `ingredientRefId` TEXT, `originalText` TEXT NOT NULL, `quantity` REAL, `unit` TEXT, `ingredientName` TEXT NOT NULL, `preparationFr` TEXT NOT NULL, `preparationEn` TEXT NOT NULL, `optional` INTEGER NOT NULL, `notesFr` TEXT NOT NULL, `notesEn` TEXT NOT NULL, `groupName` TEXT, PRIMARY KEY(`id`), FOREIGN KEY(`recipeId`) REFERENCES `recipes`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )""")
        db.execSQL("""
            INSERT INTO recipe_ingredient_lines_v8
                (id, recipeId, position, ingredientRefId, originalText, quantity, unit, ingredientName,
                 preparationFr, preparationEn, optional, notesFr, notesEn, groupName)
            SELECT id, recipeId, position, ingredientRefId, originalText, quantity, unit, ingredientName,
                   COALESCE(preparation, ''), COALESCE(preparation, ''), optional,
                   COALESCE(notes, ''), COALESCE(notes, ''), groupName
            FROM recipe_ingredient_lines
        """)
        db.execSQL("DROP TABLE recipe_ingredient_lines")
        db.execSQL("ALTER TABLE recipe_ingredient_lines_v8 RENAME TO recipe_ingredient_lines")
        db.execSQL("""CREATE UNIQUE INDEX IF NOT EXISTS `index_recipe_ingredient_lines_recipeId_position` ON `recipe_ingredient_lines` (`recipeId`, `position`)""")
        db.execSQL("""CREATE INDEX IF NOT EXISTS `index_recipe_ingredient_lines_recipeId` ON `recipe_ingredient_lines` (`recipeId`)""")
        db.execSQL("""CREATE INDEX IF NOT EXISTS `index_recipe_ingredient_lines_ingredientRefId` ON `recipe_ingredient_lines` (`ingredientRefId`)""")
        // Preserve child rows whether foreign-key cascades were enabled on this connection or not.
        db.execSQL("DELETE FROM recipe_ingredient_line_substitutions")
        db.execSQL("INSERT INTO recipe_ingredient_line_substitutions SELECT * FROM migration_line_substitutions")
        db.execSQL("DROP TABLE migration_line_substitutions")
        // An existing library must not be reseeded merely because older versions omitted this marker.
        db.execSQL("""
            INSERT INTO library_metadata (libraryId, createdAt, updatedAt, exportedAt, appVersion, deviceId)
            SELECT 'library-local',
                   COALESCE((SELECT MIN(createdAt) FROM recipes), strftime('%Y-%m-%dT%H:%M:%fZ', 'now')),
                   COALESCE((SELECT MAX(updatedAt) FROM recipes), strftime('%Y-%m-%dT%H:%M:%fZ', 'now')),
                   COALESCE((SELECT MAX(updatedAt) FROM recipes), strftime('%Y-%m-%dT%H:%M:%fZ', 'now')),
                   NULL, NULL
            WHERE NOT EXISTS (SELECT 1 FROM library_metadata)
        """)
    }
}

package app.recipebook.data.local.db

import androidx.room.Dao
import androidx.room.Embedded
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Relation
import androidx.room.Transaction
import kotlinx.coroutines.flow.Flow

@Dao
abstract class RecipeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun upsert(recipe: RecipeEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract suspend fun upsertAll(recipes: List<RecipeEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    protected abstract suspend fun upsertIngredientLines(lines: List<RecipeIngredientLineEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    protected abstract suspend fun upsertIngredientLineSubstitutions(substitutions: List<IngredientLineSubstitutionEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    protected abstract suspend fun upsertRecipeTagRefs(tagRefs: List<RecipeTagCrossRef>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    protected abstract suspend fun upsertRecipeCollectionRefs(collectionRefs: List<RecipeCollectionCrossRef>)

    @Query("DELETE FROM recipe_tag_cross_refs WHERE recipeId = :recipeId")
    protected abstract suspend fun deleteTagRefsByRecipeId(recipeId: String)

    @Query("DELETE FROM recipe_collection_cross_refs WHERE recipeId = :recipeId")
    protected abstract suspend fun deleteCollectionRefsByRecipeId(recipeId: String)

    @Query("DELETE FROM recipe_ingredient_lines WHERE recipeId = :recipeId")
    protected abstract suspend fun deleteIngredientLinesByRecipeId(recipeId: String)

    @Query("SELECT * FROM recipes WHERE id = :id LIMIT 1")
    abstract suspend fun getById(id: String): RecipeEntity?

    @Transaction
    @Query("SELECT * FROM recipes WHERE id = :id AND deletedAt IS NULL LIMIT 1")
    abstract suspend fun getByIdWithRelations(id: String): RecipeWithRelations?

    @Transaction
    @Query("SELECT * FROM recipes WHERE id = :id AND deletedAt IS NULL LIMIT 1")
    abstract fun observeById(id: String): Flow<RecipeWithRelations?>

    @Transaction
    @Query("SELECT * FROM recipes WHERE deletedAt IS NULL ORDER BY updatedAt DESC")
    abstract fun observeAll(): Flow<List<RecipeWithRelations>>

    @Transaction
    @Query(
        """
        SELECT DISTINCT recipes.*
        FROM recipes
        LEFT JOIN recipe_ingredient_lines
            ON recipe_ingredient_lines.recipeId = recipes.id
        WHERE recipes.deletedAt IS NULL AND (
            recipes.titleFr LIKE '%' || :query || '%' OR
            recipes.titleEn LIKE '%' || :query || '%' OR
            recipes.instructionsFr LIKE '%' || :query || '%' OR
            recipes.instructionsEn LIKE '%' || :query || '%' OR
            recipe_ingredient_lines.originalText LIKE '%' || :query || '%' OR
            recipe_ingredient_lines.ingredientName LIKE '%' || :query || '%'
        )
        ORDER BY recipes.updatedAt DESC
        """
    )
    abstract fun observeByTitle(query: String): Flow<List<RecipeWithRelations>>

    @Query("SELECT COUNT(*) FROM recipes WHERE deletedAt IS NULL")
    abstract suspend fun countActive(): Int

    @Query("DELETE FROM recipes WHERE id = :id")
    abstract suspend fun deleteById(id: String)

    @Transaction
    open suspend fun replaceRecipeGraph(
        recipe: RecipeEntity,
        ingredientLines: List<RecipeIngredientLineEntity>,
        ingredientLineSubstitutions: List<IngredientLineSubstitutionEntity>,
        tagRefs: List<RecipeTagCrossRef>,
        collectionRefs: List<RecipeCollectionCrossRef>
    ) {
        upsert(recipe)
        deleteTagRefsByRecipeId(recipe.id)
        deleteCollectionRefsByRecipeId(recipe.id)
        deleteIngredientLinesByRecipeId(recipe.id)
        if (ingredientLines.isNotEmpty()) {
            upsertIngredientLines(ingredientLines)
        }
        if (ingredientLineSubstitutions.isNotEmpty()) {
            upsertIngredientLineSubstitutions(ingredientLineSubstitutions)
        }
        if (tagRefs.isNotEmpty()) {
            upsertRecipeTagRefs(tagRefs)
        }
        if (collectionRefs.isNotEmpty()) {
            upsertRecipeCollectionRefs(collectionRefs)
        }
    }
}

@Dao
interface IngredientReferenceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(ingredientReference: IngredientReferenceEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(ingredientReferences: List<IngredientReferenceEntity>)

    @Query("SELECT * FROM ingredient_references ORDER BY nameEn COLLATE NOCASE ASC")
    fun observeAll(): Flow<List<IngredientReferenceEntity>>

    @Query("SELECT * FROM ingredient_references WHERE id = :id LIMIT 1")
    suspend fun getById(id: String): IngredientReferenceEntity?
}

@Dao
interface TagDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(tag: TagEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(tags: List<TagEntity>)

    @Query("SELECT * FROM tags ORDER BY nameEn COLLATE NOCASE ASC")
    fun observeAll(): Flow<List<TagEntity>>

    @Query("SELECT * FROM tags WHERE id = :id LIMIT 1")
    suspend fun getById(id: String): TagEntity?
}

@Dao
interface CollectionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(collections: List<CollectionEntity>)

    @Query("SELECT * FROM collections ORDER BY nameEn COLLATE NOCASE ASC")
    fun observeAll(): Flow<List<CollectionEntity>>
}

@Dao
interface LibrarySettingsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(settings: LibrarySettingsEntity)

    @Query("SELECT * FROM library_settings WHERE id = :id LIMIT 1")
    suspend fun getById(id: String = LibrarySettingsEntity.SINGLETON_ID): LibrarySettingsEntity?
}

@Dao
interface LibraryMetadataDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(metadata: LibraryMetadataEntity)

    @Query("SELECT * FROM library_metadata WHERE libraryId = :libraryId LIMIT 1")
    suspend fun getByLibraryId(libraryId: String): LibraryMetadataEntity?
}

data class RecipeWithRelations(
    @Embedded
    val recipe: RecipeEntity,
    @Relation(
        entity = RecipeIngredientLineEntity::class,
        parentColumn = "id",
        entityColumn = "recipeId"
    )
    val ingredientLines: List<IngredientLineWithSubstitutions>,
    @Relation(
        parentColumn = "id",
        entityColumn = "recipeId"
    )
    val tagRefs: List<RecipeTagCrossRef>,
    @Relation(
        parentColumn = "id",
        entityColumn = "recipeId"
    )
    val collectionRefs: List<RecipeCollectionCrossRef>
)

data class IngredientLineWithSubstitutions(
    @Embedded
    val ingredientLine: RecipeIngredientLineEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "ingredientLineId"
    )
    val substitutions: List<IngredientLineSubstitutionEntity>
)

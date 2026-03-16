package app.recipebook.data.local.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(recipe: RecipeEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(recipes: List<RecipeEntity>)

    @Query("SELECT * FROM recipes WHERE id = :id LIMIT 1")
    suspend fun getById(id: String): RecipeEntity?

    @Query("SELECT * FROM recipes WHERE id = :id AND deletedAt IS NULL LIMIT 1")
    fun observeById(id: String): Flow<RecipeEntity?>

    @Query("SELECT * FROM recipes WHERE deletedAt IS NULL ORDER BY updatedAt DESC")
    fun observeAll(): Flow<List<RecipeEntity>>

    @Query(
        "SELECT * FROM recipes WHERE deletedAt IS NULL AND (titleFr LIKE '%' || :query || '%' OR titleEn LIKE '%' || :query || '%') ORDER BY updatedAt DESC"
    )
    fun observeByTitle(query: String): Flow<List<RecipeEntity>>

    @Query("SELECT COUNT(*) FROM recipes WHERE deletedAt IS NULL")
    suspend fun countActive(): Int

    @Query("DELETE FROM recipes WHERE id = :id")
    suspend fun deleteById(id: String)
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

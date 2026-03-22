package app.recipebook.data.local.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        RecipeEntity::class,
        IngredientReferenceEntity::class,
        TagEntity::class,
        CollectionEntity::class,
        LibrarySettingsEntity::class,
        LibraryMetadataEntity::class
    ],
    version = 2,
    exportSchema = false
)
abstract class RecipeBookDatabase : RoomDatabase() {
    abstract fun recipeDao(): RecipeDao
    abstract fun ingredientReferenceDao(): IngredientReferenceDao
    abstract fun tagDao(): TagDao
    abstract fun collectionDao(): CollectionDao
    abstract fun librarySettingsDao(): LibrarySettingsDao
    abstract fun libraryMetadataDao(): LibraryMetadataDao

    companion object {
        const val DATABASE_NAME = "recipebook.db"
    }
}

object RecipeBookDatabaseProvider {
    @Volatile
    private var instance: RecipeBookDatabase? = null

    fun get(context: Context): RecipeBookDatabase {
        return instance ?: synchronized(this) {
            instance ?: Room.databaseBuilder(
                context.applicationContext,
                RecipeBookDatabase::class.java,
                RecipeBookDatabase.DATABASE_NAME
            ).fallbackToDestructiveMigration().build().also { db ->
                instance = db
            }
        }
    }
}




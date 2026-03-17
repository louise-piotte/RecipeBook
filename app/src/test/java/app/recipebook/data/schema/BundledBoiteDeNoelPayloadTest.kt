package app.recipebook.data.schema

import java.io.File
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class BundledBoiteDeNoelPayloadTest {

    @Test
    fun bundledBoiteDeNoelPayload_decodesToCanonicalLibraryData() {
        val jsonText = File("src/main/assets/seed/boite-de-noel.converted.library.v1.json")
            .readText()
            .trimStart('\uFEFF')
        val payload = Json { ignoreUnknownKeys = true }
            .decodeFromString(FullLibraryPayloadDto.serializer(), jsonText)

        assertEquals(SchemaVersions.FULL_LIBRARY_V1, payload.schemaVersion)
        assertEquals(12, payload.library.recipes.size)
        assertFalse(payload.library.ingredientReferences.isEmpty())
        assertTrue(payload.library.tags.size >= 4)
        assertTrue(payload.library.recipes.all { it.languages.fr.title.isNotBlank() })
        assertTrue(payload.library.recipes.all { it.languages.en.title.isNotBlank() })
        assertTrue(payload.library.recipes.all { recipe -> recipe.ingredients.all { it.ingredientRefId?.isNotBlank() == true } })
        assertTrue(payload.library.recipes.any { it.tags.contains("tag-holiday") })
        assertTrue(payload.library.ingredientReferences.any { it.nameEn == "all-purpose flour" })
        assertTrue(payload.library.ingredientReferences.any { it.nameEn == "icing sugar" })
        assertTrue(
            payload.library.ingredientReferences.any {
                it.id == "ingredient-ref-all-purpose-flour" && it.nameFr == "farine tout usage"
            }
        )
        assertTrue(
            payload.library.ingredientReferences.any {
                it.id == "ingredient-ref-icing-sugar" && it.nameFr == "sucre a glacer"
            }
        )
        assertTrue(
            payload.library.ingredientReferences.any {
                it.id == "ingredient-ref-butter" && it.nameFr == "beurre"
            }
        )
        assertTrue(payload.library.ingredientReferences.none { it.nameEn.startsWith("Suggested combinations") })
    }
}

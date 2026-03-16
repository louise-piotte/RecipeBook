package app.recipebook.data.schema

import java.io.File
import kotlinx.serialization.json.Json
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class BundledBoiteDeNoelPayloadTest {

    @Test
    fun bundledBoiteDeNoelPayload_decodesToTwelveRecipes() {
        val jsonText = File("src/main/assets/seed/boite-de-noel.converted.library.v1.json")
            .readText()
            .trimStart('\uFEFF')
        val payload = Json { ignoreUnknownKeys = true }
            .decodeFromString(FullLibraryPayloadDto.serializer(), jsonText)

        assertEquals(SchemaVersions.FULL_LIBRARY_V1, payload.schemaVersion)
        assertEquals(12, payload.library.recipes.size)
        assertTrue(payload.library.recipes.all { it.languages.fr.title.isNotBlank() })
        assertTrue(payload.library.recipes.all { it.languages.en.title.isNotBlank() })
    }
}

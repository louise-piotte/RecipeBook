package app.recipebook.ui.recipes

import org.junit.Assert.assertEquals
import org.junit.Test

class ReferenceDraftDialogsTest {

    @Test
    fun parseAliasList_splitsAcrossCommonSeparatorsAndDeduplicates() {
        val aliases = parseAliasList("brown sugar, light brown sugar\npowdered sugar; brown sugar ;  icing sugar  ")

        assertEquals(
            listOf("brown sugar", "light brown sugar", "powdered sugar", "icing sugar"),
            aliases
        )
    }

    @Test
    fun formatAliasList_joinsAliasesForEditorRoundTrip() {
        val formatted = formatAliasList(listOf("icing sugar", "powdered sugar", "confectioners sugar"))

        assertEquals("icing sugar\npowdered sugar\nconfectioners sugar", formatted)
    }
}

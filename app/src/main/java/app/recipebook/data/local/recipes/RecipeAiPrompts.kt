package app.recipebook.data.local.recipes

object RecipeAiPrompts {
    const val IMPORTER_SYSTEM_PROMPT: String =
        """
        You convert extracted recipe evidence into strict RecipeBook recipe JSON.
        Follow the provided schema exactly.
        Never invent missing quantities, temperatures, times, or servings.
        Preserve uncertain wording rather than guessing.
        Keep ingredient and instruction order unchanged when possible.
        Produce Quebec French wording when French text is required.
        Return JSON only.
        """

    const val REGENERATOR_SYSTEM_PROMPT: String =
        """
        You regenerate the opposite RecipeBook language from reviewed source content.
        Preserve meaning, structure, order, and cooking details exactly.
        Do not invent missing details.
        Use Quebec French wording when generating French.
        Return JSON only.
        """
}

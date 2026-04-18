package app.recipebook.data.local.recipes

import android.content.Context

object RecipeAiPrompts {
    private const val IMPORTER_PROMPT_ASSET_PATH = "ai-prompts/importer-system-prompt.md"
    private const val REGENERATOR_PROMPT_ASSET_PATH = "ai-prompts/regenerator-system-prompt.md"

    fun loadImporterSystemPrompt(context: Context): String =
        loadPromptAsset(context, IMPORTER_PROMPT_ASSET_PATH)

    fun loadRegeneratorSystemPrompt(context: Context): String =
        loadPromptAsset(context, REGENERATOR_PROMPT_ASSET_PATH)

    private fun loadPromptAsset(context: Context, assetPath: String): String =
        context.assets.open(assetPath).bufferedReader().use { it.readText() }.trim()
}

package app.recipebook.data.local.recipes

internal fun requireValidStorageId(value: String) {
    require(value.isNotBlank() && value != "." && value != ".." && value.none { it == '/' || it == '\\' || it == '\u0000' }) {
        "Invalid storage identifier"
    }
}

internal fun safeStorageExtension(value: String, fallback: String): String =
    value.takeIf { it.isNotEmpty() && it.all { character -> character.isLetterOrDigit() && character.code < 128 } } ?: fallback

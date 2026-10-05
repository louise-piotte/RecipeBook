package app.recipebook.data.local.recipes

import kotlinx.coroutines.CancellationException

/** A backup failure must not turn an already committed local edit into a failed save. */
internal suspend fun runRecipeBackupAfterMutation(
    refresh: suspend () -> Unit,
    onFailure: suspend (Exception) -> Unit
) {
    try {
        refresh()
    } catch (error: CancellationException) {
        throw error
    } catch (error: Exception) {
        onFailure(error)
    }
}

package app.recipebook.data.local.recipes

import kotlinx.coroutines.CancellationException

internal inline fun <T> runCatchingRecipeWork(block: () -> T): Result<T> = try {
    Result.success(block())
} catch (error: CancellationException) {
    throw error
} catch (error: Exception) {
    Result.failure(error)
}

internal inline fun <T> Result<T>.recoverCatchingRecipeWork(transform: (Throwable) -> T): Result<T> =
    fold(onSuccess = { Result.success(it) }, onFailure = { error -> runCatchingRecipeWork { transform(error) } })

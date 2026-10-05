package app.recipebook.data.local.recipes

import java.io.File
import java.io.IOException

/** Retains the previous media until the accompanying database transaction commits. */
internal class RecipeMediaReplacement(
    private val staged: List<File>,
    private val managed: List<File>,
    private val backupRoot: File,
    private val move: (File, File) -> Unit = { source, target ->
        if (!source.renameTo(target)) throw IOException("Unable to move managed recipe media")
    }
) {
    private val backedUp = mutableListOf<Pair<File, File>>()
    private val installed = mutableListOf<File>()
    private var completed = false

    fun install() {
        check(backedUp.isEmpty() && installed.isEmpty() && !completed)
        check(backupRoot.mkdirs() || backupRoot.isDirectory)
        try {
            managed.zip(staged).forEach { (target, source) ->
                if (target.exists()) {
                    val backup = File(backupRoot, target.name)
                    move(target, backup)
                    backedUp += target to backup
                }
                if (source.exists()) {
                    move(source, target)
                    installed += target
                }
            }
        } catch (error: Throwable) {
            try { rollback() } catch (rollbackError: Exception) { error.addSuppressed(rollbackError) }
            throw error
        }
    }

    fun rollback() {
        if (completed) return
        installed.asReversed().forEach { target ->
            if (target.exists() && !target.deleteRecursively()) throw IOException("Unable to remove imported recipe media")
        }
        installed.clear()
        backedUp.asReversed().forEach { (target, backup) -> move(backup, target) }
        backedUp.clear()
    }

    fun complete() {
        completed = true
        // Old files can remain for later cleanup if deletion fails; current data is already safe.
        backupRoot.deleteRecursively()
        backedUp.clear()
        installed.clear()
    }
}

package app.recipebook.data.local.shoppinglist

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

private val Context.shoppingListDataStore: DataStore<Preferences> by preferencesDataStore(name = "shopping_list_local")

class ShoppingListLocalStore(
    private val context: Context
) {
    private val keyStateJson = stringPreferencesKey("shopping_list_state_json")
    private val keyStateJsonBackup = stringPreferencesKey("shopping_list_state_json_backup")

    val state: Flow<ShoppingListState> = context.shoppingListDataStore.data.map { prefs ->
        readStateFromPreferences(prefs)
    }

    suspend fun currentState(): ShoppingListState = state.first()

    suspend fun replaceState(newState: ShoppingListState) {
        updateState { newState }
    }

    suspend fun addOrUpdateEntry(entry: ShoppingListEntry, rememberNameForReuse: Boolean = true) {
        val cleanedName = entry.name.trim()
        require(cleanedName.isNotEmpty()) { "Entry name must not be blank." }

        updateState { previous ->
            val now = Time.nowIsoUtc()
            val normalized = entry.copy(
                name = cleanedName,
                amount = entry.amount?.trim()?.takeIf { it.isNotEmpty() },
                updatedAt = now
            )

            val updatedEntries = previous.entries
                .filterNot { it.id == normalized.id }
                .plus(
                    if (previous.entries.any { it.id == normalized.id }) {
                        normalized.copy(createdAt = previous.entries.first { it.id == normalized.id }.createdAt)
                    } else {
                        normalized.copy(createdAt = now, updatedAt = now)
                    }
                )

            val updatedMemory = if (rememberNameForReuse) {
                upsertRememberedName(previous.nameMemory, cleanedName, normalized.sectionId)
            } else {
                previous.nameMemory
            }

            previous.copy(entries = updatedEntries, nameMemory = updatedMemory)
        }
    }

    suspend fun setEntryChecked(entryId: String, checked: Boolean) {
        updateState { previous ->
            previous.copy(
                entries = previous.entries.map { entry ->
                    if (entry.id == entryId) {
                        entry.copy(checked = checked, updatedAt = Time.nowIsoUtc())
                    } else {
                        entry
                    }
                }
            )
        }
    }

    suspend fun deleteEntry(entryId: String) {
        updateState { previous ->
            previous.copy(entries = previous.entries.filterNot { it.id == entryId })
        }
    }

    suspend fun deleteCheckedEntries() {
        updateState { previous ->
            previous.copy(entries = previous.entries.filterNot { it.checked })
        }
    }

    suspend fun deleteAllEntries() {
        updateState { previous ->
            previous.copy(entries = emptyList())
        }
    }

    suspend fun addOrUpdateSection(section: ShoppingSection) {
        val cleanedName = section.name.trim()
        require(cleanedName.isNotEmpty()) { "Section name must not be blank." }

        updateState { previous ->
            val existing = previous.sections.firstOrNull { it.id == section.id }
            val normalized = section.copy(name = cleanedName)
            val nextSortOrder = previous.sections.maxOfOrNull { it.sortOrder }?.plus(1) ?: 0

            val merged = previous.sections
                .filterNot { it.id == section.id }
                .plus(
                    if (existing != null) {
                        normalized.copy(sortOrder = existing.sortOrder)
                    } else {
                        normalized.copy(sortOrder = nextSortOrder)
                    }
                )
                .sortedBy { it.sortOrder }

            previous.copy(sections = merged)
        }
    }

    suspend fun renameSection(sectionId: String, newName: String) {
        val cleanedName = newName.trim()
        require(cleanedName.isNotEmpty()) { "Section name must not be blank." }

        updateState { previous ->
            previous.copy(
                sections = previous.sections.map { section ->
                    if (section.id == sectionId) section.copy(name = cleanedName) else section
                }
            )
        }
    }

    suspend fun deleteSection(sectionId: String) {
        updateState { previous ->
            previous.copy(
                sections = previous.sections.filterNot { it.id == sectionId },
                entries = previous.entries.map { entry ->
                    if (entry.sectionId == sectionId) entry.copy(sectionId = null, updatedAt = Time.nowIsoUtc()) else entry
                },
                nameMemory = previous.nameMemory.map { remembered ->
                    if (remembered.sectionId == sectionId) remembered.copy(sectionId = null) else remembered
                }
            )
        }
    }

    suspend fun suggestNames(query: String, limit: Int = 8): List<NameSuggestion> {
        val snapshot = currentState()
        val sectionsById = snapshot.sections.associateBy { it.id }
        return ShoppingNameSuggester.suggest(
            memory = snapshot.nameMemory,
            sectionsById = sectionsById,
            query = query,
            limit = limit
        )
    }

    private suspend fun updateState(transform: (ShoppingListState) -> ShoppingListState) {
        context.shoppingListDataStore.edit { prefs ->
            val currentRaw = prefs[keyStateJson]
            val current = readStateFromPreferences(prefs)
            val next = transform(current).copy(updatedAt = Time.nowIsoUtc())
            if (!currentRaw.isNullOrBlank()) {
                prefs[keyStateJsonBackup] = currentRaw
            }
            prefs[keyStateJson] = ShoppingListStateCodec.encode(next)
        }
    }

    private fun readStateFromPreferences(prefs: Preferences): ShoppingListState {
        val primaryRaw = prefs[keyStateJson]
        val backupRaw = prefs[keyStateJsonBackup]

        decodeOrNull(primaryRaw)?.let { return it }
        decodeOrNull(backupRaw)?.let { return it }

        return ShoppingListState()
    }

    private fun decodeOrNull(raw: String?): ShoppingListState? {
        if (raw.isNullOrBlank()) {
            return null
        }
        return runCatching { ShoppingListStateCodec.decode(raw) }.getOrNull()
    }

    private fun upsertRememberedName(
        current: List<RememberedEntryName>,
        displayName: String,
        sectionId: String?
    ): List<RememberedEntryName> {
        val normalized = ShoppingText.normalize(displayName)
        if (normalized.isBlank()) return current

        val existing = current.firstOrNull { it.normalizedName == normalized }
        val now = Time.nowIsoUtc()

        val updated = if (existing == null) {
            current + RememberedEntryName(
                displayName = displayName,
                normalizedName = normalized,
                sectionId = sectionId,
                useCount = 1,
                lastUsedAt = now
            )
        } else {
            current.map { remembered ->
                if (remembered.normalizedName == normalized) {
                    remembered.copy(
                        displayName = displayName,
                        sectionId = sectionId ?: remembered.sectionId,
                        useCount = remembered.useCount + 1,
                        lastUsedAt = now
                    )
                } else {
                    remembered
                }
            }
        }

        return updated
            .sortedWith(compareByDescending<RememberedEntryName> { it.useCount }.thenByDescending { it.lastUsedAt })
            .take(500)
    }
}

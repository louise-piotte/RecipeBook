package app.recipebook.data.local.settings

import android.content.Context
import android.net.Uri
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import java.io.IOException
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

private val Context.driveSyncDataStore: DataStore<Preferences> by preferencesDataStore(name = "drive_sync_settings")

data class DriveSyncSettings(
    val documentUri: Uri? = null
)

class DriveSyncSettingsStore(private val context: Context) {
    private val documentUriKey = stringPreferencesKey("drive_document_uri")

    val settings: Flow<DriveSyncSettings> = context.driveSyncDataStore.data
        .catch { exception ->
            if (exception is IOException) {
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }
        .map { prefs ->
            DriveSyncSettings(
                documentUri = prefs[documentUriKey]?.let(Uri::parse)
            )
        }

    suspend fun get(): DriveSyncSettings = settings.first()

    suspend fun setDocumentUri(uri: Uri?) {
        context.driveSyncDataStore.edit { prefs ->
            if (uri == null) {
                prefs.remove(documentUriKey)
            } else {
                prefs[documentUriKey] = uri.toString()
            }
        }
    }
}

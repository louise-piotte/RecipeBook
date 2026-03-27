package app.recipebook.data.local.settings

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import app.recipebook.domain.model.AppLanguage
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.appLanguageDataStore: DataStore<Preferences> by preferencesDataStore(name = "app_language")

class AppLanguageStore(private val context: Context) {
    private val languageKey = stringPreferencesKey("selected_language")

    val language: Flow<AppLanguage> = context.appLanguageDataStore.data.map { prefs ->
        when (prefs[languageKey]) {
            AppLanguage.FR.name -> AppLanguage.FR
            else -> AppLanguage.EN
        }
    }

    suspend fun setLanguage(language: AppLanguage) {
        context.appLanguageDataStore.edit { prefs ->
            prefs[languageKey] = language.name
        }
    }
}

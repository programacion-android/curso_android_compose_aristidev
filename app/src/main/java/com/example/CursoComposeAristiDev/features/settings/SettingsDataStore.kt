package com.example.CursoComposeAristiDev.features.settings

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map



/*1º Declarar variable Context.datastore para acceder
a la base de datos local de preferencias de la libreria incluida
(Es la forma más sencilla)
*/
val Context.datastore by preferencesDataStore(name="settings")


/*
2º. Crear objeto con las claves de preferencias:
NOTIFICATIONS, VIBRATION, SOUNDS
Empezaremos guardando solo la primera.
*/
private object PreferencesKey{
    val NOTIFICATIONS= booleanPreferencesKey(name="notifications")
    val VIBRATION= booleanPreferencesKey("vibration")
    val SOUNDS=booleanPreferencesKey("sounds")
    val USERNAME= stringPreferencesKey("username")
}

/*
3º. Crear clase para escuchar los cambios en las claves
de preferencias realizados por el usuario
y actualizarlos en la base de datos
 */
class SettingsDataStore(private val context: Context){
    //3.a) Escuchar cambios en la clave de preferencia NOTIFICATIONS
    val notificationsEnabled: Flow<Boolean> = context.datastore.data.map{
        preferences -> preferences[PreferencesKey.NOTIFICATIONS]?:true
        //?:true  significa que si NOTIFICATIONS es null o no tiene valor la activa a true
    }
    //Repetir 3.a) para las claves de preferencias VIBRATIONS y SOUNDS
    val vibrationsEnabled:Flow<Boolean> = context.datastore.data.map {
        preferences -> preferences[PreferencesKey.VIBRATION]?:true
    };
    val soundsEnabled:Flow<Boolean> = context.datastore.data.map {
        preferences -> preferences[PreferencesKey.SOUNDS]?:true
    }

    val username:Flow<String> = context.datastore.data.map {
        preferences -> preferences[PreferencesKey.USERNAME]?:""
    }

    //3.b) Actualizar el estado o cambio de la variable notifications en la base de datos
    suspend fun setNotificationsEnabled(enabled:Boolean){
        context.datastore.edit{ /* SOLUCIÓN ERROR: poner delante de esta funcion la palabra
        suspend; porque edit es una función suspendida y debe ejecutarse
        dentro de una corrutina o hilo distinto al que gestiona la IU del MainActivity
        */
            preferences -> preferences[PreferencesKey.NOTIFICATIONS]=enabled
        }
    }
    //Repetir paso 3.b) para actualizar el estado de las variables vibration y sounds
    suspend fun setVibrationsEnabled(enabled: Boolean){
        context.datastore.edit{ preferences -> preferences[PreferencesKey.VIBRATION]=enabled}
    }
    suspend fun setSoundEnabled(enabled: Boolean){
        context.datastore.edit{preferences -> preferences[PreferencesKey.SOUNDS]=enabled}
    }

    suspend fun setUsername(username: String){
        context.datastore.edit{preferences -> preferences[PreferencesKey.USERNAME]=username}
    }


}//fin SettingsDataStore

package com.example.CursoComposeAristiDev.features.settings

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.example.CursoComposeAristiDev.features.settings.PreferencesKey.NOTIFICATIONS
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

    //3.b) Actualizar el estado o cambio de NOTIFICATIONS en la base de datos
    suspend fun setNotificationsEnabled(enabled:Boolean){
        context.datastore.edit{ /* SOLUCIÓN ERROR: poner delante de esta funcion la palabra
        suspend; porque edit es una función suspendida y debe ejecutarse
        dentro de una corrutina o hilo distinto al que gestiona la IU del MainActivity
        */
            preferences -> preferences[PreferencesKey.NOTIFICATIONS]=enabled
        }
    }
}//fin SettingsDataStore

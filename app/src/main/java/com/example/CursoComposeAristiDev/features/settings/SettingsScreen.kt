package com.example.CursoComposeAristiDev.features.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.R
import com.example.CursoComposeAristiDev.ui.theme.colorBackgroundComponent
import com.example.CursoComposeAristiDev.ui.theme.colorSecondaryText
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import com.example.CursoComposeAristiDev.ui.theme.colorAppBackground
import com.example.CursoComposeAristiDev.ui.theme.colorControl
import kotlinx.coroutines.launch

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(onBackSelected: () -> Unit = {}) {
    //1º.- constante context representa el contexto o composable actual
    val context = LocalContext.current

    //2º- constante settingsDataStore representa la base de datos (BD) de preferencias
    /*¡Ojo!No deberíamos declararla dentro de un composable
    ya que este puede ser recompuesto cada vez que cambie
    de estado, creando de nuevo la variable de BD.
    De momento, la declaramos en este composable usamos
    remember para que recuerde los cambios de estado de la BD.
    */
    //val settingsDataStore= SettingsDataStore(context)
    val settingsDataStore = remember { SettingsDataStore(context) }

    //Declarar variable coroutineScope para ejecutar dentro de un hilo un método suspendido
    val coroutineScope = rememberCoroutineScope()
    /*
     3º Escuchar el cambio de las preferencias de notificaciones
     */
    val notificationsEnabled by settingsDataStore.notificationsEnabled.collectAsState(true)
    //Repetir paso 3º para escuchar las otras variables de preferencias: vibration y sounds
    val vibrationEnabled by settingsDataStore.vibrationsEnabled.collectAsState(true)
    val soundsEnabled by settingsDataStore.soundsEnabled.collectAsState(true)
    val username by settingsDataStore.username.collectAsState("")
    /*
    key1: recoge el último valor actualizado en la base de datos de username
    usernameText: regoge el valor de key1 cada vez que se actualiza
     */
    var usernameText by remember(username) {
        mutableStateOf(username)
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Ajustes") },
                navigationIcon = {
                    IconButton(onClick = onBackSelected) {
                        Icon(
                            painter = painterResource(R.drawable.ic_back),
                            contentDescription = "Flecha ir atrás: MenuScreen"
                        )
                    }
                })
        },
        containerColor = colorAppBackground
        //Ojo!!Añadir en el Scaffold de SettingScreen
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            //1ª Card para cuenta de usuario o nickName
            Text(
                "CUENTA",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = colorSecondaryText
            )
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = colorBackgroundComponent),
            ) {
                // usernameSetting(username = "ARIS", onUsernameChanged = {}, onSave = {})
                /*
                  Sustituir el literal "ARIS" por la variable username declarada anteriormente.
                  PERO ESTO NO FUNIONARIA: Porque si solo hacemos esto, el usuario no veria
                  la nueva cadena que está escribiendo para username, porque solo se guarda
                  en la base de datos, cuando se pulsa el botón onSave:
                 */
                usernameSetting(
                    username = usernameText,
                    onUsernameChanged = {
                        usernameText = it
                    }, onSave = {
                        coroutineScope.launch {
                            settingsDataStore.setUsername(usernameText)
                        }
                    })
            }//fin nickNameCard

            Spacer(modifier = Modifier.height(32.dp))

            Text("PREFERENCIAS")

            //2ª Card para preferencias
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorBackgroundComponent
                ),
            ) {
                Column() {
                    //¡Ojo! Sustituir el código repetido por 3 llamadas al composable SettingSwitch
                    //LLamada1
                    SettingSwitch(
                        "Notificaciones",
                        "Recibir avisos de la app",
                        notificationsEnabled,
                        onCheckedChange = { isChecked ->
                            coroutineScope.launch {
                                settingsDataStore.setNotificationsEnabled(isChecked)
                            }
                        })
                    //LLamada2
                    SettingSwitch(
                        "Vibración",
                        "Vibrar al recibir acciones",
                        vibrationEnabled,
                        onCheckedChange = { isChecked ->
                            coroutineScope.launch {
                                settingsDataStore.setVibrationsEnabled(isChecked)  /*Es una forma
                             de pasar el nuevo valor*/
                            }
                        })
                    //LLamada3
                    SettingSwitch(
                        "Sonidos",
                        "Reproducir sonidos en la app",
                        soundsEnabled,
                        onCheckedChange = {
                            coroutineScope.launch {
                                settingsDataStore.setSoundEnabled(it)  /*it, es una forma
                             de pasar el nuevo valor*/
                            }
                        })
                    /* Switch(checked = notificationsEnabled, onCheckedChange = { isChecked ->
                         coroutineScope.launch {
                             settingsDataStore.setNotificationsEnabled(isChecked)
                         }
                     })

                     Switch(checked = vibrationEnabled, onCheckedChange = { isChecked ->
                         coroutineScope.launch {
                             settingsDataStore.setVibrationsEnabled(isChecked)  /*Es una forma
                             de pasar el nuevo valor*/
                         }
                     })


                     Switch(checked = soundsEnabled, onCheckedChange = {
                         coroutineScope.launch {
                             settingsDataStore.setSoundEnabled(it)  /*it, es una forma
                             de pasar el nuevo valor*/
                         }
                     })
                     */

                }
            }
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = {}) { Text("RESTABLECER AJUSTES") }

        }
    }//fin Scaffold
}//fin SettingsScreen


@Composable
fun SettingSwitch(
    title: String,
    description: String,
    enabled: Boolean = true,
    onCheckedChange: (Boolean) -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 18.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                title, fontSize = 16.sp, fontWeight = FontWeight.Medium,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                description,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = colorSecondaryText
            )
            Switch(
                checked = enabled, onCheckedChange = onCheckedChange,
                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.White,
                    uncheckedThumbColor = colorSecondaryText,
                    checkedTrackColor = colorControl,
                    uncheckedTrackColor = colorBackgroundComponent,
                    uncheckedBorderColor = colorSecondaryText
                )
            )
        }
    }//fin SettingSwitch
}//fin SettingsScreen
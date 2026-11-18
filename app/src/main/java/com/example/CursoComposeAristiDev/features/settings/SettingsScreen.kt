package com.example.CursoComposeAristiDev.features.settings

import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
import kotlinx.coroutines.launch
@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(onBackSelected: () -> Unit = {}) {
    //1º.- constante context representa el contexto o composable actual
    val context= LocalContext.current

    //2º- constante settingsDataStore representa la base de datos (BD) de preferencias
    /*¡Ojo!No deberíamos declararla dentro de un composable
    ya que este puede ser recompuesto cada vez que cambie
    de estado, creando de nuevo la variable de BD.
    De momento, la declaramos en este composable usamos
    remember para que recuerde los cambios de estado de la BD.
    */
    //val settingsDataStore= SettingsDataStore(context)
    val settingsDataStore= remember {SettingsDataStore(context)}

    //Declarar variable coroutineScope para ejecutar dentro de un hilo un método suspendido
    val coroutineScope = rememberCoroutineScope()
    /*
     3º Escuchar el cambio de las preferencias de notificaciones
     */
    val notificationsEnabled by settingsDataStore.notificationsEnabled.collectAsState(true)
    //Repetir paso 3º para escuchar las otras variables de preferencias: vibration y sounds
    val vibrationEnabled by settingsDataStore.vibrationsEnabled.collectAsState(true)
    val soundsEnabled by settingsDataStore.soundsEnabled.collectAsState(true)

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
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            //1ª Card para cuenta de usuario o nickName
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorBackgroundComponent
                ),
            ) {
                Text(
                    "CUENTA",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorSecondaryText
                )
                TextField(
                    value = "ARIS",
                    onValueChange = {})
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
                    /*4º.- Mostrar el valor de las notificaciones (notificationnsEnabled)
                    después de cada cambio y  actualizarlo en la base de datos    */
                    Switch(checked = notificationsEnabled, onCheckedChange = {
                            isChecked ->
                        coroutineScope.launch {
                            settingsDataStore.setNotificationsEnabled(isChecked)
                        }
                    })
                    /*Switch(checked = false, onCheckedChange = {})
                    Switch(checked = true, onCheckedChange = {})*/
                    //Repetir paso 4º para las variables vibration y sounds
                    Switch(checked = vibrationEnabled, onCheckedChange = {
                        isChecked->
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
                }
            }
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = {}) {   Text("RESTABLECER AJUSTES")     }

        }
    }//fin Scaffold
}//fin SettingsScreen
package com.example.CursoComposeAristiDev.features

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//Recuerda pasar fillMaxWidth en su llamada
//desde MainActivity
//   MenuScreen(modifier = Modifier.fillMaxWidth())
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(modifier: Modifier = Modifier, onIMCSelected:()->Unit) {
    Scaffold(modifier = modifier, topBar = {
        TopAppBar(title = {Text("AristiDevs App")})
    }) {
        paddingValues ->
        Column(modifier=modifier.padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
               onIMCSelected()
            }) {
                Text("IMC Calculator")
            }
            Spacer(modifier=Modifier.height(24.dp))
            Button(onClick = {
                //No hay código que ejecutar
            }) {
                Text("IMC Calculator")
            }
        }
    }
}
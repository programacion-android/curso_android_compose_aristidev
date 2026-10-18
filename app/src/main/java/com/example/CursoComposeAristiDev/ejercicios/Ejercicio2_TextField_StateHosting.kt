package com.example.CursoComposeAristiDev.ejercicios

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Ejercicio2_TextField_StateHosting(modifier: Modifier = Modifier) {
   var texto by rememberSaveable() { mutableStateOf("hola") }

    Column(modifier=modifier.padding(25.dp)) {
        TextField(
            value = texto,
            onValueChange = {nuevoTexto -> texto=nuevoTexto},
            label = {Text("Ejercicio2 TextField & StateHosting")}
        )
    }


}
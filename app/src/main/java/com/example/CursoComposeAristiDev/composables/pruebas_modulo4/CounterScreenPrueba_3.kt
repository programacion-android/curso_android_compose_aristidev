package com.example.CursoComposeAristiDev.composables.pruebas_modulo4

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreenPrueba(modifier: Modifier = Modifier) {
    var counter by remember { mutableStateOf(0) }
    Column(modifier=modifier.padding(30.dp)){
        Text("Pulsaciones: $counter")
        Button(onClick = {
            counter++
            Log.d("counter",counter.toString());
        }) {
            Text("Sumar")
        }
    }
}
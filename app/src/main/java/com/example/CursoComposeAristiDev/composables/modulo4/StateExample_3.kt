package com.example.CursoComposeAristiDev.composables.modulo4

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen(modifier: Modifier = Modifier) {
    //var counter = 23
    var counter by rememberSaveable{mutableStateOf(0)}
    Column(modifier = modifier.padding(30.dp)) {
        Text("Pulsaciones: $counter")
        Button(onClick = {
            counter++
            Log.d("counter",counter.toString())
        }) {
            Text("Sumar")
        }
    }
}
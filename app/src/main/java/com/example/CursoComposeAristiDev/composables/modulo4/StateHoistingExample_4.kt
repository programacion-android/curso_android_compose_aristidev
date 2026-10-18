package com.example.CursoComposeAristiDev.composables.modulo4

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen_Example4(modifier: Modifier= Modifier) {
    var counter1 by rememberSaveable{mutableStateOf(0)}
    var counter2 by rememberSaveable{mutableStateOf(0)}
    //Ojo1: Pasamos un modifier a Column (y es el que
    // recibe el padre CounterScreen_Example4, desde MainActivity)
    Column(modifier=modifier,
   // Column(modifier=Modifier.fillMaxSize(),
       verticalArrangement = Arrangement.Center,
       horizontalAlignment = Alignment.CenterHorizontally) {
       //Ojo2: Pasamos un modifier a CounterReusable (pero no es el que
       // recibe el padre CounterScreen_Example4, desde MainActivity)
       CounterReusable(modifier=Modifier.background(color = Color.Green),
           counter1,
           onIncrement = {counter1++})
       Spacer(modifier = Modifier.height(16.dp))
       CounterReusable(modifier=Modifier.background(color=Color.Red),
           counter2,
           onIncrement = {counter2++})
   }
}

@Composable
fun CounterReusable(modifier: Modifier = Modifier,
                    counter: Int,
                    onIncrement:()->Unit) {

   // Column(modifier = modifier.padding(30.dp)) {
    // Ojo3: Posible Error: si modifier es el mismo de su padre (fillMaxSize):
    // ya que hace que el Primer CounterReusable creado ocupe toda la pantalla
    //por lo tanto debemos asegurarnos no no recibir el modifier de su padre sino Modifier
    Column(modifier = modifier.padding(30.dp)) {
        Text("Pulsaciones: $counter")

        Button(onClick = {onIncrement()}){
            Text("Sumar")
        }
    }
}
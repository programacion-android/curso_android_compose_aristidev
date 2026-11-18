package com.example.cursoandroidcompose.composables.JesusSecoGomezExamen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.CursoComposeAristiDev.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color

@Preview
@Composable
fun examenB(){
    Row(modifier=Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.videojuego),
            contentDescription = null)
        Box(){
            Text("Nuevo",color= Color.Green)
        }
        Column() {
            Text("")
            Text("Reino de las sombras", color= Color.Magenta)
            Text("Aventura * Fantasía", color= Color.Gray)
            Text("Explora un reino misterioso, supera desafios y descubre secretos ocultos", color= Color.White)
            Text(":) 4'5/5", color= Color.Yellow)
            Text("29.99€", color= Color.White)
            Button(onClick = {println("Comprado")},
                content = {Text("Comprar Juego")} )
        }


    }
}
package com.example.CursoComposeAristiDev.examenes

import androidx.compose.foundation.layout.Column

import androidx.compose.material3.Button

import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.graphics.Color

@Preview
@Composable
fun BotonSaludar(){
    Column() {
        Text("Pulsa el botón")
        Button(
            onClick = {},
            colors= ButtonDefaults.buttonColors(
            containerColor=Color.Blue,
            contentColor= Color.White,
            disabledContainerColor= Color.Black,
            disabledContentColor= Color.Gray
        )){
            Text("Saludar")

        }
    }
}
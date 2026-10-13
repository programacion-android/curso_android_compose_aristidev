package com.example.CursoComposeAristiDev.composables.modulo2_organizadores

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun BoxExample7_1() {
    //Si no se indica el tamaño de Box se ajusta a su contenido
    Box() {
        Text("Hola")
        Text("Grupo 2DAM")
    }
}
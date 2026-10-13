package com.example.CursoComposeAristiDev.composables.modulo2_organizadores

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun RowColumnExample_6() {
    Row() {
        Text("Hola 1")
        Text("Hola 2")
        Column() {
            Text("Hola 3")
            Text("Hola 4")
            Text("Hola 5")
        }

    }
}
package com.example.CursoComposeAristiDev.composables.modulo2_organizadores

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ColumnAlinearExample7_4() {
    Column(modifier = Modifier.size(150.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text("Hola 1")
        Text("Hola 2")
        Text("Hola 3")
        Text("Hola 4")
        Text("Hola 5")
    }
}
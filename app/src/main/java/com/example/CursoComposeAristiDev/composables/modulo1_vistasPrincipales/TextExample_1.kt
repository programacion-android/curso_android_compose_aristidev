package com.example.CursoComposeAristiDev.composables.modulo1_vistasPrincipales

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun ExampleText(name:String="Pepe"){
   Text(name, color=Color.Green, fontSize = 12.sp)
  //  crearText("Pepe")
}

@Composable
private fun crearText(string: String) {
    Text("Pepe", color = Color(0xFF2196F3), fontSize = 12.sp)
}


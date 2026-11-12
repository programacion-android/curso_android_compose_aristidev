package com.example.CursoComposeAristiDev.examenes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Tarjeta(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier

            .background(
                color = Color(0xFFCEE6F1)

            )
            .padding(22.dp)
    ) {
        Text("Encarna", modifier = Modifier.background(Color.Blue,
            RoundedCornerShape(12.dp) ), color=Color(0xFFF6F1F1))
        Text("Balsera")
    }
}
package com.example.CursoComposeAristiDev.ejercicios

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.CursoComposeAristiDev.R

@Preview(showBackground = true)
@Composable
fun ImagenConEtiqueta(modifier: Modifier = Modifier) {
    Box(modifier = modifier.padding(20.dp)){
        Image(
            painter = painterResource(R.drawable.paisaje),
            contentDescription = null,
            modifier = Modifier.width(250.dp).height(180.dp)
        )
        Text("Nuevo",
            color=Color.White,
            modifier = Modifier.background(color=Color.Red))
    }

}
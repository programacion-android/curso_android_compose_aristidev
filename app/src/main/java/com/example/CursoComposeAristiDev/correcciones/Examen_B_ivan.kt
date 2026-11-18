package com.example.RA1_TareaEvaluable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.R

@Preview
@Composable
fun Examen_B() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.LightGray, RoundedCornerShape(10.dp))
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box {
            Image(
                painter = painterResource(R.drawable.videojuego),
                contentDescription = "Videojuego",
                modifier = Modifier.size(width = 120.dp, height = 170.dp)
            )
            Text(
                text = "NUEVO",
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .background(Color.Red)
                    .padding(4.dp),
                fontSize = 12.sp
            )
            Column(modifier = Modifier
                .padding(start = 200.dp)
            ) {
                Text(
                    text = "Elderand",
                    color = Color.Red,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Aventura y fantasía",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = "Explora un reino misterioso, supera desafíos y descubre secretos ocultos",
                    fontSize = 14.sp,
                    color = Color.White,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = "Valoración: 4,8/5",
                    fontSize = 14.sp,
                    color = Color.Yellow,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Text(
                    text = "29,99€",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 8.dp)
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue
                    ),
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Text(text = "Comprar juego")
                }
            }
        }
    }
}


package com.example.curso_androidcompose.composable.RA1TareaEvaluable


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.R



@Composable
@Preview
fun PantallaJuegoB() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.White, RoundedCornerShape(12.dp))
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .width(120.dp)
                .height(170.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.lago),
                contentDescription = "videojuego",
                modifier = Modifier
                    .width(120.dp)
                    .height(170.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "NUEVO",
                color = Color.White,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .background(Color.Green)
                    .padding(6.dp)
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Text(
                text = "Reino de Sombras",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Aventura - Fantasia",
                fontSize = 14.sp,
                color = Color.DarkGray
            )

            Text(
                text = "Explora un reino misterioso, supera desafios y descubre secretos ocultos",
                fontSize = 14.sp,
                color = Color.DarkGray
            )

            Text(
                text = "Valoración: 4,5/5",
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Yellow
            )

            Text(
                text = "29,99 €",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Magenta
            )

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Comprar juego",
                    color = Color.White
                )
            }
        }
    }
}

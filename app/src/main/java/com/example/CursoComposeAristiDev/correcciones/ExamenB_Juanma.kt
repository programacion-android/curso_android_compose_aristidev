package com.example.examenB

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
@Composable
fun ExamenB() {
    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {

        Row(modifier = Modifier.fillMaxWidth()) {

            Box {
                Image(
                    painter = painterResource(id = R.drawable.videojuego),
                    contentDescription = "Reino de Sombras",
                    modifier = Modifier.size(width = 120.dp, height = 170.dp)
                )

            }

            Column(modifier = Modifier.padding(start = 12.dp)) {
                Text(
                    text = "Reino de Sombras",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF7E57D9)
                )
                Text(
                    text = "Explora un reino misterioso, supera desafíos y descubre secretos ocultos.",
                    fontSize = 14.sp,
                    color = Color.DarkGray
                )
                Text(
                    text = "4,8 / 5",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFFFFA000)
                )
                Text(
                    text = "29,99 €",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Red
                )
            }
        }
        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth().padding(top = 12.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7E57D9))
        ) {
            Text(text = "Comprar juego", color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaJuegoBPreview() {
    ExamenB()
}


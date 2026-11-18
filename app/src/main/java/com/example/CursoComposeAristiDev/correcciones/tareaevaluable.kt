package com.example.CursoComposeAristiDev.correcciones

import androidx.compose.foundation.Image
import com.example.CursoComposeAristiDev.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun PantallaJuegoB() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Box {
            Image(
                painter = painterResource(R.drawable.videojuego),
                contentDescription = "Videojuego",
                modifier = Modifier.size(120.dp, 170.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                "NUEVO",
                modifier = Modifier
                    .background(Color.Red)
                    .padding(4.dp),
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text(
                "Reino de Sombras",
                fontSize = 20.sp,
                color = Color.Cyan,
                fontWeight = FontWeight.Bold

            )
             Text("Aventura y fantasía",color = Color.White,)

             Text("Explora un reino lleno de misterios.",color = Color.White,)

             Text("Valoración: 4,5/5",color = Color.Yellow,)

             Text(
                 "39,99 €",
                 fontSize = 20.sp,
                 color = Color.Green)

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta
                )
            ) {
                Text("Comprar juego")
            }
        }
    }
}





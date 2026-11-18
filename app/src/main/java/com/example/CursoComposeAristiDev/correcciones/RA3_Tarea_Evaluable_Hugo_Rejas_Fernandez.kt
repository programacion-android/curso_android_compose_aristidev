package com.example.myapplication.modulo4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.CursoComposeAristiDev.R

@Preview
@Composable
fun examenA(modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)
        .background(color = Color.White)) {
        Box(modifier = Modifier
            .padding(10.dp)
            .background(Color.Blue)){
            Column() {//Error1: innecesaria esta columna dentro de Box
                Image(
                    modifier =
                        Modifier.size(250.dp, 180.dp),
                    painter =
                        painterResource(R.drawable.lago),
                    contentDescription = "User profile"
                )
                Text("DESTINO DESTACADO", textAlign = TextAlign.Left)
            }
        }
        //Error2: no das formato a los texto: tamaño, tipo de letra,..
        Text("Lagos de Covadonga")
        Text("Asturias · Naturaleza y montaña")
        Text("Descubre un paisaje único de lagos, montañas y senderos en pleno Parque Nacional de los Picos de Europa.")
        Row(Modifier
            .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically) { //Error3: falta distribución en la horizontal
            Column(Modifier
                .padding(5.dp)
                .background(color = Color.LightGray)) {
                Text("☻")
                Text("Ubicación")
            }
            Column(Modifier
                .padding(5.dp)
                .background(Color.LightGray)) {
                Text("♥")
                Text("Favorito")
            }
        }
        Button(onClick = {}) {
            Text("MÁS INFORMACIÓN", textAlign = TextAlign.Center)
        }
    }

}
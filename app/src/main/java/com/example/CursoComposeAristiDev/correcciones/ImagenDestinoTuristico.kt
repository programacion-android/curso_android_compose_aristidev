package com.example.cursoandroidcompose.Tarea_Evaluable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.CursoComposeAristiDev.R


@Preview
@Composable
fun ImagenDestinoTuristico() {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            Image(
                painter = painterResource(R.drawable.lago),
                contentDescription = "Paisaje",
                modifier = Modifier.size(250.dp, 180.dp)
            )
            Text("DESTINO DESTACADO", color = Color.Red, modifier = Modifier
                .align(Alignment.BottomEnd) )
        }
        Text(
            text = "Lagos de covadonga",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .background(Color.Black)
                .padding(10.dp)
        )
        Text(
            text = "Asturias: Naturaleza y Montaña",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .background(Color.Gray)
                .padding(4.dp)
        )
        Text(
            text = "Descubre un paisaje unico de lagos, montañas y senderos en pleno parque nacional" +
                    " de los picos de europa",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .background(Color.Black)
                .padding(6.dp)
        )
    }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Button(
            onClick = {
                println("Ubicacion")
            },
            modifier = Modifier.size(100.dp,100.dp)
                .background(Color.Gray)
                .padding(50.dp,50.dp)
                .align (Alignment.Bottom)
        ) {

        }
        Button(
            onClick = {
                println("Favorito")
            },
            modifier = Modifier.size(100.dp,100.dp)
                .background(Color.Gray)
                .padding(50.dp,50.dp)
                .align(Alignment.Bottom)
        ) {

        }
    }
    Button(
        onClick = {
            println("Mas información")
        },
        modifier = Modifier.size(150.dp,150.dp)
            .background(Color.Blue)
            .padding(100.dp,100.dp)
    ) {

    }

}
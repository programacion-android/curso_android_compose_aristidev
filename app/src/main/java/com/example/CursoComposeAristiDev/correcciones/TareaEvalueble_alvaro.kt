package com.example.cursoandroidcompouse.composable.TareaEvaluable


import android.R.attr.text
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.R


@Preview
@Composable
fun pantallaLago(){

    Box(){

        Image(
            painter = painterResource( id = R.drawable.lago),
            contentDescription = "nationalgeographic.com.es",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "DESTINO DESTACADO",
            color = Color.White,
            fontSize = 11.sp,
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(8.dp)
                .background(color = Color.Red)
                .padding(horizontal = 8.dp, vertical = 4.dp)
        )
        Column(modifier = Modifier.background(color = Color.Blue)) {

            Text(
                text = "Lago de Covadonga",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Asturias. Naturaleza y montaña",
                fontSize = 13.sp,
                color = Color.Gray
            )
            Text(
                text = "Descubre un paisaje único de lagos, montañas y senderos en pleno Parque nacional de los picos de Europa" +
                        "",
                fontSize = 14.sp
            )

            Row() {

                Box(modifier = Modifier
                    .background(color = Color.Gray)) {
                    Text(text = "Ubicacion")

                }
                Box(modifier = Modifier
                    .background(color = Color.Gray)) {
                        Text(text = "Favorito")
                    }
            }


            Button(onClick = {}, modifier = Modifier.background(color = Color.Blue)) {
                Text(text = "Más informacion")
            }
        }



    }






}
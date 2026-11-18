package com.example.cursoandroidcompose.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.CursoComposeAristiDev.R

@Preview
@Composable

fun RA1TareaEvaluable() {


    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Absolute.Left,
        verticalAlignment = Alignment.CenterVertically  //Error0: sobra
    ) {
        //Error1: Box va dentro de Row
        Box(
            modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.TopStart
        ) {
            Image(
                painter =
                    painterResource(R.drawable.lago),
                contentDescription = (null)
            )
            //Error2: Aqui iria el Texto DEstacable que debería alinear arriba-derecha
        }

        Column() { //Error3: falta modifier o disposicón en la vertical para separar sus contenidos
            Text("Ubicacion", color = Color.Yellow)
            Text("Favorito", color = Color.Yellow)
            Button(onClick = {}) {
                Text("Mas Informacion")

            }
        }
    }
}







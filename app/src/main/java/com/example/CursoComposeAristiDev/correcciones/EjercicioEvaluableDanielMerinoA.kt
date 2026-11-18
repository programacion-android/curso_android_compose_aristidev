package com.example.ejercicio_evaluable_compose.EjerciciosGuia1


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource


import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.R

@Preview
@Composable
fun ejercicioEvaluable(modifier: Modifier= Modifier){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            modifier.background(color = Color.LightGray)
            Image(
                painter =painterResource(R.drawable.lago),
                contentDescription = "Lago del examen",
                modifier.size(250.dp, 180.dp)
            )
            Text(
                text = "Destino Destacado",
                modifier.align(Alignment.BottomEnd).background(color = Color.Red),
                color = Color.White
            )

        }
        Column(
            modifier.fillMaxWidth(1f).padding(10.dp).background(color = Color.White),
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text="Lago Destino",
                fontSize = 20.sp
            )
            Text("Descripción: Este  lago cuenta con unas vistas preciosas")
            Text("Localización: Don Benito")
        }
        Row(modifier.fillMaxWidth(1f).background(color = Color.Cyan)
            .padding(10.dp)
            , horizontalArrangement = Arrangement.spacedBy(10.dp,
                alignment = Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Ubicación",
                fontSize = 15.sp
            )
            Text(
                text = "Favorito",
                fontSize = 15.sp
            )
        }

        Button(onClick = {},
            content = {
                Text("Más Información")
            })
    }
}
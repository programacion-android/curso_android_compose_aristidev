package com.example.CursoComposeAristiDev.composables.modulo4


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ListExample_2 (modifier: Modifier = Modifier) {
    //Creamos una lista de nombres
    val names = listOf(
        "Aris",
        "MoureDev",
        "BettaTech",
        "SUSCRIBETE",
        "Manolo",
        "Pepe",
        "Aris",
        "MoureDev",
        "BettaTech",
        "SUSCRIBETE",
        "Manolo",
        "Pepe",
        "Aris",
        "MoureDev",
        "BettaTech",
        "SUSCRIBETE",
        "Manolo",
        "Pepe",
        "Aris",
        "MoureDev",
        "BettaTech",
        "SUSCRIBETE",
        "Manolo",
        "Pepe"
    )
    LazyColumn(modifier = modifier) {
        item{
            Box(
                modifier=Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .background(Color.Cyan),
                contentAlignment=Alignment.Center
            ){
                Text("Nombres")
            }
        }
        items(names) {
            Text(it)
        }
    }
}

    //Mostramos en columna dichos nombres
   /* Column(modifier=modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        names.forEach {
            Text(it)
        }*/
  //  }
//}
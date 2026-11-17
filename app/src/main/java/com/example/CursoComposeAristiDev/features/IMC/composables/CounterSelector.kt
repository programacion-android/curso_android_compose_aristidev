package com.example.CursoComposeAristiDev.features.IMC.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.ui.theme.colorBackgroundComponent
import com.example.CursoComposeAristiDev.ui.theme.colorControl
import com.example.CursoComposeAristiDev.ui.theme.colorSecondaryText



/*
* CounterSelector está formado por dos CounterCard (nuevo composable)
* */
@Composable
fun CounterSelector(
    age: Int,
    onPlusAgeSelected: () -> Unit,
    onMinusAgeSelected: () -> Unit,
    weight: Int,
    onPlusWeightSelected: () -> Unit,
    onMinusWeightSelected: () -> Unit
) {

        Row(modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalArrangement =Arrangement.spacedBy(16.dp)
        ) {
            CounterCard(
                modifier = Modifier.weight(1f),
                title = "Peso",
                value = weight,
                onPlus = { onPlusWeightSelected() },
                onMinus = { onMinusWeightSelected() })
            CounterCard(
                modifier = Modifier.weight(1f),
                title = "Edad",
                value = age,
                onPlus = { onPlusAgeSelected() },
                onMinus = { onMinusAgeSelected() })

    }

}//fin CounterSelector

//Añadir parámetro modifier (para recibir el ancho de la card)
@Composable
fun CounterCard(
    modifier: Modifier = Modifier,
    title: String,
    value: Int,
    onPlus: () -> Unit,
    onMinus: () -> Unit
) {
    Card(modifier.height(180.dp),
        shape = RoundedCornerShape(16.dp),
        colors= CardDefaults.cardColors(
            containerColor = colorBackgroundComponent
        )) {
        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(6.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Mejora4. Aumentar tamaño fuente textos: title y value
            Text(title, fontSize = 48.sp, fontWeight = FontWeight.Bold,color= colorSecondaryText)
            Text(value.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold)

            //Mejora3. Botones redondos
            //Mejora1.Forma2. Dejar espacio entre los botones
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                FloatingActionButton(onClick = {onPlus()},
                    modifier = Modifier.size(52.dp),
                    shape=RoundedCornerShape(16.dp),
                    containerColor = colorControl,
                    contentColor=Color.White
                ) {
                    Text("+")
                }
                FloatingActionButton(onClick = {onMinus()},
                    modifier = Modifier.size(52.dp),
                    shape=RoundedCornerShape(16.dp),
                    containerColor = colorControl,
                    contentColor=Color.White
                ) {
                    Text("-")
                }
              /* Button(onClick = {onPlus()},
                   modifier = Modifier.size(42.dp),
                    contentPadding = PaddingValues(0.dp)) {
                    Text("+")
                }
                Button(onClick = {onMinus()}, modifier = Modifier.size(42.dp),
                    contentPadding = PaddingValues(0.dp)) {
                    Text("-")
                }*/


            }
            //Mejora1.Forma1. Dejar espacio entre los botones
            /*Row(modifier= Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround) {
                Button(onClick = {}) { Text("+") }
                Button(onClick = {}) { Text("+") }
            }*/
        }
    }
}//fin CounterCard

@Preview
@Composable
fun ConterCardPreview() {
    CounterCard(
        modifier = Modifier.width(200.dp),
        title = "PESO",
        value = 90,
        {},
        {})
}



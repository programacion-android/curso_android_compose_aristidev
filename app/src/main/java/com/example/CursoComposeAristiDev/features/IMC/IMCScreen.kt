package com.example.CursoComposeAristiDev.features.IMC

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.features.IMC.composables.CounterSelector
import com.example.CursoComposeAristiDev.features.IMC.composables.GenderSelector
import com.example.CursoComposeAristiDev.features.IMC.composables.HeightSelector
import com.example.CursoComposeAristiDev.ui.theme.AppBackground

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun IMCScreen(onResultSelected: (Float) -> Unit = {},
              onBackSelected:()->Unit={}) {
    var isMaleSelected by remember { mutableStateOf(true) }
    var height by remember { mutableStateOf(160f) }
    var age by remember { mutableStateOf(18) }
    var weight by remember { mutableStateOf(60) }

    Scaffold(
        topBar = {
            //¡Ojo! Es experimental
            TopAppBar(title = { Text("IMC Calculadora") })
        },
        containerColor = AppBackground
    ) { paddingValues ->
        Column(Modifier
            .fillMaxSize()
            .padding(paddingValues)) {
            GenderSelector(
                isMaleSelected = isMaleSelected,
                onGenderSelected = {
                    isMaleSelected = it
                }
            )
            HeightSelector(height = height, onHeightChange = {
                height = it  //¡Importante! Descomentar, para recibir it (nueva altura)
            })

            CounterSelector(
                age = age,
                onPlusAgeSelected = { age++ },
                onMinusAgeSelected = { age-- },
                weight = weight,
                onPlusWeightSelected = { weight++ },
                onMinusWeightSelected = { weight-- })

            Spacer(Modifier.weight(1f))
            Button(
                onClick = {
                    /*Calcular el resultado de BMI y ejecutar la funcion de
                    callBack pasándole dicho resultado. Esto es hacer 'state hoisting'*/
                    val result: Float = calculateBMI(weight = weight, height = height)

                    onResultSelected(result)
                }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .height(64.dp),
                shape = RoundedCornerShape(4)
            ) {
                Text("Calcular", fontSize = 28.sp)
            }
        }//fin Column
    }

}//finIMCScreen

private fun calculateBMI(weight: Int, height: Float): Float {
    val height_metres = height / 100
    return weight / (height_metres * height_metres)

}






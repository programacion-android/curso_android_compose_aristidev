package com.example.CursoComposeAristiDev.features.IMC

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.ui.theme.colorAppBackground
import com.example.CursoComposeAristiDev.ui.theme.colorPrimaryButton

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun IMCResultScreen(result: Float = 20f, onBackSelected: () -> Unit = {}) {
    val category = getBmiCategory(result)
    val description = getBmiDescription(result)
    val color = getBmiColor(result)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Analizando ...") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorAppBackground,
                    titleContentColor = Color.White
                )
            )
        },
        containerColor = colorAppBackground

    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(
                "Tu resultado: ",
                color = Color.White,
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(32.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                shape = RoundedCornerShape(16.dp)
            ) {
                /*Card Ocupa todo el espacio sobrante*/
                Text(category, color = color, fontSize = 28.sp, fontWeight = FontWeight.ExtraBold)
                Text(
                    String.format("%.2f", result),
                    color = Color.White,
                    fontSize = 74.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    description, color = Color.White, fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = {
                    onBackSelected()
                }, modifier = Modifier
                    .fillMaxWidth()
                    .height(72.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorPrimaryButton,
                    contentColor = Color.White
                )
            ) {
                Text("Recalcular", fontSize = 28.sp, fontWeight = FontWeight.ExtraBold)
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }//fin Scaffold
}//fin IMCResultScreen

/*Retorna la categoria para un valor de bmi o índice de
* masa corporal */
fun getBmiCategory(bmi: Float): String {
    return when {
        bmi < 18.5f -> "Bajo peso"
        bmi < 25f -> "Normal"
        bmi < 30f -> "Sobrepeso"
        else -> "Obesidad"
    }
}

/*Retorna descripción a partir de un valor bmi o indice de masa
* corporal*/
fun getBmiDescription(bmi: Float): String {
    return when {
        bmi < 18.5f -> "Bajo peso: por debajo del peso recomendado"
        bmi < 25f -> "Normal: tu peso es el recomendado"
        bmi < 30f -> "Sobrepeso: tu peso excede de lo normal"
        else -> "Obesidad: debes ir al dietista cuanto antes"
    }
}

/*
Retorna un color para un valor de bmi o índice de* masa corporal
 */
fun getBmiColor(bmi: Float): Color {
    return when {
        bmi < 18.5f -> Color(0xFF03A9F4)
        bmi < 25f -> Color(0xFF14EA1C)
        bmi < 30f -> Color(0xFF9C27B0)
        else -> Color(0xFFF44336)
    }
}
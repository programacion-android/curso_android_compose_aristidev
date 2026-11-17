package com.example.CursoComposeAristiDev.features.IMC.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
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

@Composable
fun HeightSelector(height: Float, onHeightChange: (Float) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
           // containerColor = colorUnSelectedCard
            containerColor = colorBackgroundComponent

        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Altura", fontSize = 18.sp, color = colorSecondaryText)
            Text(
                "${height.toInt()} cms", fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Slider(
                value = height,
                onValueChange = { onHeightChange(it) },
                valueRange = 120f..220f,
                colors = SliderDefaults.colors(
                    thumbColor = colorControl,
                    activeTrackColor = colorControl,
                    inactiveTrackColor = Color.White.copy(alpha = 025f)
                )
            )

        }
    }
}

@Preview
@Composable
fun HeightSelectorPreview() {
    /*¡Importante!: Este composable permite previsualizar HeightSelector.
    De esta forma, no hace falta que HeightSelector inicialice en su cabecera
    sus parámetros.
    */
    HeightSelector(height = 160f, onHeightChange = {})

}
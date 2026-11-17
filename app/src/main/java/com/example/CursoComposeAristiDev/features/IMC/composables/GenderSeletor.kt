package com.example.CursoComposeAristiDev.features.IMC.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.AndroidFont
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.ui.theme.colorAppBackground
import com.example.CursoComposeAristiDev.ui.theme.colorBackgroundComponent
import com.example.CursoComposeAristiDev.ui.theme.colorBackgroundComponentSelected
import com.example.CursoComposeAristiDev.ui.theme.colorSecondaryText

/*
  Selector de género formado por dos cards o tarjetas
  para elegir entre hombre o mujer
 */
@Preview
@Composable
fun GenderSelector(isMaleSelected: Boolean = true, onGenderSelected: (Boolean) -> Unit = {}) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        //Sustituir Box por composable GenderCard (que debemos crear)
        GenderCard(
            modifier = Modifier.weight(1f),
            gender = "hombre",
            symbol = "♂",
            isSelected = isMaleSelected,
            onClick = { onGenderSelected(true) })

        GenderCard(
            modifier = Modifier.weight(1f),
            gender = "mujer",
            symbol = "♀",
            isSelected = !isMaleSelected,
            onClick = { onGenderSelected(false) })

    }
}

@Composable
fun GenderCard(
    modifier: Modifier = Modifier,
    gender: String = "",
    symbol: String = "",
    isSelected: Boolean = true,
    onClick: () -> Unit = {}
) {
    /*¡Importante! Estos colores se guardan en
    ui.theme.Color.kt para que sean compartidos
    en todo el proyecto de Android*/

   /* val colorSelectedCard = Color(0xFF4287f5)
    val colorUnSelectedCard = Color(0xFFabc8f7)
   */

    // val color = if (isSelected) {Color.Red} else {Color.Cyan}
    val colorContenedor = if (isSelected) {
        colorBackgroundComponentSelected
       // colorSelectedCard
       // Color.Red
    } else {
        colorBackgroundComponent
        //colorUnSelectedCard
        //Color.Cyan
    }
    Card(
        modifier = modifier
            .height(160.dp)
            // .background(color)
            .clickable { onClick() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorContenedor,
           // containerColor = colorBackgroundComponent,
            contentColor = Color.White
        )
    ) {

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(symbol, fontSize = 64.sp, fontWeight = FontWeight.ExtraBold)
            Text(gender, fontSize = 18.sp,
                fontWeight = FontWeight.Medium,
                color= colorSecondaryText)
        }
    }
}//fin GenderCard


//GenderCard(Modifier.weight(1f))
//GenderCard(gender="Hombre",symbol="h",onClick={onGenderSelected(true)})

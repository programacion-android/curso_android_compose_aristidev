package com.example.CursoComposeAristiDev.composables.modulo3_Modifier

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Ejemplo9() {

    //cajasEnColumna()
    Row(){
        Box(modifier=Modifier.fillMaxHeight().weight(1f).background(Color.Red)){}
        Box(modifier=Modifier.fillMaxHeight().weight(1f).background(Color.Blue)){}
        Box(modifier=Modifier.fillMaxHeight().weight(1f).background(Color.Yellow)){}
    }

}

@Composable
private fun cajasEnColumna() {
    Column() {
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Red)) {}
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Blue)) {}
        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Yellow)) {}

    }
}
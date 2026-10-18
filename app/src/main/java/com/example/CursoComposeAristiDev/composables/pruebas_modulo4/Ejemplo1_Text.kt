package com.example.CursoComposeAristiDev.composables.pruebas_modulo4

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle

@Composable
fun Ejemplo1TExt(modifier: Modifier = Modifier) {
    //var test = "AristiDev";
    var test by remember { mutableStateOf("") }
    Box(modifier=Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center){

        TextField(value = test, onValueChange ={
            myTest -> test=myTest
        } )
    }
}
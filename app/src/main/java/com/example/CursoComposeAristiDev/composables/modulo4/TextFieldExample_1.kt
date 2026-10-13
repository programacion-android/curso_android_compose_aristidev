package com.example.CursoComposeAristiDev.composables.modulo4

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun TextFieldExample_1() {
    /* Mejora2: añadir parámetro label para describir
    * el contenido de TextField*/

    var test by remember  { mutableStateOf("") }
    Box(Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        TextField(
            value=test,
            onValueChange = {
               myText -> test=myText
            },
            label={Text("Introduce número:")}
        );
    }
}
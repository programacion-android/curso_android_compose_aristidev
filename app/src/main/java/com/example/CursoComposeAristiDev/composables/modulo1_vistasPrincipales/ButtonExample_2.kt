package com.example.CursoComposeAristiDev.composables.modulo1_vistasPrincipales

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun ButtonExample_2(){
    Button(onClick = {
        /*Funcion lambda1 de callBack: se ejecuta cuando
        se pulsa click en el botón
         */
        print("Has pulsado el botón")

    }, enabled = false) {
        /*Función lambda2: contenido
        */
         Text("Pulsame")
    }
}
package com.example.CursoComposeAristiDev.composables.modulo1_vistasPrincipales

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.CursoComposeAristiDev.R

@Preview
@Composable
fun ImageExample(){
    /*
      contentDescription= permite describir la imagen. Aunque
      puede tomar un null, es mejor que tenga una cadena no vacia,
      ya que favorece la usabilidad de usuarios con discapacidades
     */
    Image(painter= painterResource(R.drawable.gomu),
        contentDescription = "User avatar")
}
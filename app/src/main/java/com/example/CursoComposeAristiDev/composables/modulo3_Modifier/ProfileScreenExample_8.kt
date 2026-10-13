package com.example.CursoComposeAristiDev.composables.modulo3_Modifier

import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.CursoComposeAristiDev.R


@Preview(showSystemUi = true) //Muestra barra de acciones móvil
@Composable
fun ProfileScreen_8() {

    //profileScreen_a()
    // profileScreen_b()
    // profileScreen_c()
    // profileScreen_d()
    // profileScreen_e()
   // profileScreen_f()
    // profileScreen_g_h()
    //profileScreen_i()
    profileScreen_j()

}

@Composable
private fun profileScreen_j() {
    //Mejorar Box haciendolo clicable
    Box(modifier = Modifier
        .fillMaxSize()
        .clickable {
            //Aqui iría el código a ejecutar al pulsar sobre Box
        }
        .padding(vertical = 20.dp), contentAlignment = Alignment.TopStart) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF82BBEA))
                .padding(horizontal = 22.dp, vertical = 40.dp),

            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Image(
                modifier = Modifier.size(75.dp),
                painter = painterResource(R.drawable.gomu),
                contentDescription = "User profile"
            )
            Column() {
                Text("AristiDev", color = Color.White)
                Text("Developer", color = Color.White)

            }
            Button(onClick = {}) {
                Text("Follow")
            }
        }
    }

}

@Composable
private fun profileScreen_i() {
    //Mejorar Box haciendolo clicable
    Box(modifier = Modifier
        .fillMaxSize()
        .clickable {
            //Aqui iría el código a ejecutar al pulsar sobre Box
        }
        .padding(vertical = 20.dp), contentAlignment = Alignment.TopStart) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 22.dp, vertical = 40.dp)
                .background(color = Color(0xFF82BBEA)),

            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Image(
                modifier = Modifier.size(75.dp),
                painter = painterResource(R.drawable.gomu),
                contentDescription = "User profile"
            )
            Column() {
                Text("AristiDev", color = Color.White)
                Text("Developer", color = Color.White)

            }
            Button(onClick = {}) {
                Text("Follow")
            }
        }
    }

}

@Composable
private fun profileScreen_g_h() {
    //Añadir imagen y mejorar Row
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 22.dp, vertical = 40.dp)
                .background(color = Color(0xFF82BBEA)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Image(
                modifier = Modifier.size(75.dp),
                painter = painterResource(R.drawable.gomu),
                contentDescription = "User profile"
            )
            Column() {
                Text("AristiDev", color = Color.White)
                Text("Developer", color = Color.White)

            }
            Button(onClick = {}) {
                Text("Follow")
            }
        }
    }

}

@Composable
private fun profileScreen_f() {
    //f) Añadir Box para centrar los elementos
    // Y no pasa nada ¿por qué? Porque debemos indicar el tamaño de Box
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 22.dp, vertical = 40.dp)
                .background(color = Color(0xFF82BBEA)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column() {
                Text("AristiDev", color = Color.White)
                Text("Developer", color = Color.White)
            }
            Button(onClick = {}) {
                Text("Follow")
            }
        }
    }

}

@Composable
private fun profileScreen_e() {
    //e) Cambio2 y Cambio3
    Row(
        modifier = Modifier

            .fillMaxWidth()  //Cambio2
            .padding(horizontal = 22.dp, vertical = 40.dp)

            .background(color = Color.Blue)
    ) {
        Column() { //Cambio3
            Text("AristiDev")
            Text("Developer")

        }
        Button(onClick = {}) {
            Text("Follow")
        }
    }
}

@Composable
private fun profileScreen_d() {
    //c) Añadir fondo Rojo a Column
    Row(
        modifier = Modifier

            .fillMaxSize()
            .padding(horizontal = 22.dp, vertical = 40.dp)

            .background(color = Color.Blue)
    ) {
        Column(modifier = Modifier.background(color = Color.Red)) {
            Text("AristiDev")
            Text("Developer")

        }
        Button(onClick = {}) {
            Text("Follow")
        }
    }
}

@Composable
private fun profileScreen_c() {
    //c) Añadir fondo Azul a Row, concatenando el nuevo Modifier al que retorna padding
    Row(
        modifier = Modifier

            .fillMaxSize()
            .padding(horizontal = 22.dp, vertical = 40.dp)

            .background(color = Color.Blue)
    ) {
        Column() {
            Text("AristiDev")
            Text("Developer")

        }
        Button(onClick = {}) {
            Text("Follow")
        }
    }
}

@Composable
private fun profileScreen_b() {
    //b) Añadimos Modifier a Row para añadir padding en todos los bordes
    // Row(modifier = Modifier.padding(22.dp)) {
    Row(modifier = Modifier.padding(horizontal = 22.dp, vertical = 40.dp)) {
        Column() {
            Text("AristiDev")
            Text("Developer")

        }
        Button(onClick = {}) {
            Text("Follow")
        }
    }
}

@Composable
private fun profileScreen_a() {
    //a) Empezamos a crear nuestra pantalla de perfil (sin Modifier)
    //¿Cómo se ve en la vista previa? ¿Y en un AVD?
    Row() {
        Column() {
            Text("AristiDev")
            Text("Developer")

        }
        Button(onClick = {}) {
            Text("Follow")
        }
    }
}
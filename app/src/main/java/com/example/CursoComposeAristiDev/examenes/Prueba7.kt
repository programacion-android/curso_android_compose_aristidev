package com.example.CursoComposeAristiDev.examenes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.R

@Preview
@Composable
fun PerfilAlumno() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),

                  horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.lago),
            contentDescription = "Foto de Carlos",
            modifier = Modifier
                //.size(80.dp)
                .clip(CircleShape)
        )

        Text("Carlos", fontSize = 22.sp)
        Text("Alumno de programación")

        Button(onClick = {}) {
            Text("Ver perfil")
        }
    }
}
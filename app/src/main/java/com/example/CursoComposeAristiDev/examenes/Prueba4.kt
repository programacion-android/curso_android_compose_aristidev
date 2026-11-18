package com.example.CursoComposeAristiDev.examenes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.CursoComposeAristiDev.R

@Preview
@Composable
fun Prueba4(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ){
        Column(
            modifier = Modifier.padding(8.dp).background(color=Color.Red),
           // verticalArrangement = Arrangement.Center
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Icon(
              painter = painterResource(R.drawable.thumb_up),
                contentDescription = null,
                modifier=Modifier.size(24.dp)
            )
            Text("Me gusta")
        }
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
            // verticalArrangement = Arrangement.Center
            ) {
            Icon(
                painter = painterResource(R.drawable.star_circle_outline),
                contentDescription = null,
                modifier=Modifier.size(24.dp)
            )
            Text("Favoritos")
        }
    }
}
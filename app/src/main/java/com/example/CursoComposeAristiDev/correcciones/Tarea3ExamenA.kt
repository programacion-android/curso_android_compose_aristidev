package com.example.cursoandroidcompose.TareaRA1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.R

@Preview
@Composable
fun PantallaDestinoScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFF7F7F7))
            .padding(16.dp)
            .border(1.dp, Color(0xFFDDDDDD), RoundedCornerShape(12.dp))
            .background(Color.White, RoundedCornerShape(12.dp))
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 1. Box + Image con etiqueta superpuesta
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFDCE6F5), RoundedCornerShape(10.dp))
                .padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painterResource(R.drawable.lago),
                contentDescription = "Foto del destino",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 250.dp, height = 180.dp)
                    .clip(RoundedCornerShape(10.dp))
            )

            Text(
                text = "DESTINO DESTACADO",
                color = Color.White,
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(4.dp)
                    .background(Color(0xFFC62828), RoundedCornerShape(4.dp))
                    .padding(horizontal = 8.dp, vertical = 4.dp)
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // 2. Column + Text
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Lagos de Covadonga",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Eslovenia · Naturaleza y montaña",
                fontSize = 13.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Descubre un lago de aguas cristalinas rodeado de bosques y picos nevados en los Alpes Julianos.",
                fontSize = 14.sp
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // 3. Row con dos elementos informativos
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFE3E6EA), RoundedCornerShape(8.dp))
                    .padding(vertical = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(text = "()", fontSize = 13.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Ubicación", fontSize = 13.sp)
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFE3E6EA), RoundedCornerShape(8.dp))
                    .padding(vertical = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(text = "<3", fontSize = 13.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Favorito", fontSize = 13.sp)
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        // 4. Botón
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1565C0))
        ) {
            Text(text = "MÁS INFORMACIÓN", fontWeight = FontWeight.Bold)
        }
    }
}


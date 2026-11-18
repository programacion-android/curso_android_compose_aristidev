
package com.example.miprimeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
fun ejercicio_evaluable() {
    val verde = Color.Green

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 5.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(14.dp)
            ) {

                // Imagen de 250 x 180 dp con etiqueta superpuesta
                Box(
                    modifier = Modifier
                        .size(width = 250.dp, height = 180.dp)
                        .align(Alignment.CenterHorizontally)
                        .clip(RoundedCornerShape(12.dp))
                ) {
                    Image(
                        painter = painterResource(
                            id = R.drawable.lago
                        ),
                        contentDescription = "Lago entre montañas",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                    // Etiqueta superpuesta sobre la imagen
                    Box(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(8.dp)
                            .background(
                                color = verde,
                                shape = RoundedCornerShape(6.dp)
                            )
                            .padding(
                                horizontal = 10.dp,
                                vertical = 6.dp
                            )
                    ) {
                        Text(
                            text = "DESTINO DESTACADO",
                            color = Color.White,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Nombre del destino
                Text(
                    text = "Lago Jasna",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF18352B)
                )

                Spacer(modifier = Modifier.height(6.dp))

                // Descripción
                Text(
                    text = "Un lago de aguas cristalinas rodeado " +
                            "de bosques y majestuosas montañas. " +
                            "El lugar perfecto para desconectar " +
                            "y disfrutar de la naturaleza.",
                    fontSize = 14.sp,
                    color = Color(0xFF59665F),
                    lineHeight = 21.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                // Localización
                Text(
                    text = " Kranjska Gora, Eslovenia",
                    fontSize = 13.sp,
                    color = verde,
                    fontWeight = FontWeight.Medium
                )

                Spacer(modifier = Modifier.height(18.dp))

                // Fila con dos elementos informativos
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Color(0xFFEAF3EE),
                            shape = RoundedCornerShape(10.dp)
                        )
                        .padding(12.dp),
                    horizontalArrangement =
                        Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = " Ubicación",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = verde
                        )
                        Text(
                            text = "Alpes Julianos",
                            fontSize = 12.sp,
                            color = Color.DarkGray
                        )
                    }

                    Column(
                        horizontalAlignment = Alignment.End
                    ) {
                        Text(
                            text = " Favorito",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = verde
                        )
                        Text(
                            text = "Naturaleza",
                            fontSize = 12.sp,
                            color = Color.DarkGray
                        )
                    }
                }

                Spacer(modifier = Modifier.height(18.dp))

                // Botón de información
                Button(
                    onClick = { /* Sin navegación */ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = verde
                    )
                ) {
                    Text(
                        text = "Más información",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

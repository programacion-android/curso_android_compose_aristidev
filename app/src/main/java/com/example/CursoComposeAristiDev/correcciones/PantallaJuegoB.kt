package compable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.CursoComposeAristiDev.R


@Preview
@Composable
private fun PantallaJuegoB () {
    Row(modifier = Modifier.fillMaxWidth()
        .background(Color.Green),

        horizontalArrangement = Arrangement.spacedBy(12.dp),
            verticalAlignment = Alignment.CenterVertically,

        ){
        Box(modifier = Modifier.size(width = 120.dp, height = 170.dp)){
            Image(
            painter = painterResource(R.drawable.paisaje),
            contentDescription = "videojuego",
            modifier = Modifier.fillMaxSize()
                .width(120.dp)
                .height(170.dp),


        )
        }

        Column() {
            Box() {
                Text("nuevo" ,  modifier = Modifier
                    .align(Alignment.TopStart)
                    .background(Color.Red)
                    .padding(6.dp),
                    color = Color.White)

            } // fin box

            Column(modifier = Modifier
                .padding(8.dp),


                ) {

                Text("Reino de Sombras" )
                Text("Explora un reino  misterioso , supera  desafios  y descubres secretos ", fontSize = 15.sp)
                Text("4,8/5", fontSize = 12.sp)
                Text("29,99 ", fontSize =12.sp)
            }//fin columna

            Button(onClick = {
            },
                modifier = Modifier.fillMaxWidth()
                    .background(Color(0xFF9C27B0))
                    .height(50.dp)

            ) {
                Text("Comprar videojuego")
            } // fin de botton
        }//Fin columna 1



    }

}

package PantallaExamenA

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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

@Composable
fun PantallaDestino() {

    // Column principal de la pantalla
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {

        // Box para colocar la imagen
        Box {

            // Imagen del destino de 250 x 180 dp
            Image(
                painter = painterResource(R.drawable.lago),
                contentDescription = "Imagen del lago",
                modifier = Modifier.size(
                    width = 250.dp,
                    height = 180.dp
                )
            )

        }

        // Etiqueta para resaltar el destino
        Text(
            text = "DESTINO DESTACADO",
            color = Color.White,
            modifier = Modifier
                .background(Color.Red)
                .padding(5.dp)
        )

        // Nombre del destino
        Text(
            text = "Lagos de Covadonga"
        )

        // Localización
        Text(
            text = "Asturias: Naturaleza y montaña"
        )

        // Descripción
        Text(
            text = "Descubre un paisaje único de lagos, montañas y senderos en pleno Parque Nacional de los Picos de Europa"
        )


        // Fila con los dos elementos informativos
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {

            Text(
                text = "Ubicación"
            )

            Text(
                text = "Favorito"
            )
        }

        // Botón
        Button(
            onClick = { },
            modifier = Modifier.height(40.dp)
        ) {
            Text(
                text = "Más información"
            )
        }
    }
}


// Vista previa
@Preview(showBackground = true)
@Composable
fun PantallaDestinoPreview() {

    PantallaDestino()

}




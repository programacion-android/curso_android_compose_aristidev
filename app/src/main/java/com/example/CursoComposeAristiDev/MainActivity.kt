package com.example.CursoComposeAristiDev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.CursoComposeAristiDev.composables.modulo1_vistasPrincipales.ButtonExample_2
import com.example.CursoComposeAristiDev.composables.modulo1_vistasPrincipales.ExampleText
import com.example.CursoComposeAristiDev.composables.modulo1_vistasPrincipales.ImageExample
import com.example.CursoComposeAristiDev.composables.modulo4.CounterScreen
import com.example.CursoComposeAristiDev.ui.theme.CursoComposeAristiDev_Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CursoComposeAristiDev_Theme {
                CounterScreen(Modifier.fillMaxSize())
                //  ListExample_2()
                // TextFieldExample_1()
                /* ExampleText()
                 ButtonExample_2()
                 ImageExample()*/

                //ProfileScreen_8()

                /* Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                     Greeting(
                         name = "Android",
                         modifier = Modifier.padding(innerPadding)
                     )
                 }*/
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExampleText()
    ButtonExample_2()
    ImageExample()
    /*HelloWorld_1Theme {
        Greeting("Android")
    }*/
}
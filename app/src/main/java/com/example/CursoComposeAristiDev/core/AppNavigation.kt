package com.example.CursoComposeAristiDev.core

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.CursoComposeAristiDev.features.IMC.IMCScreen
import com.example.CursoComposeAristiDev.features.MenuScreen

@Composable
fun AppNavigation() {
    //Pila con el orden para visualizar las pantallas
    //Si tenemos P1,P2,P3 y borro P3 debería mostrarse P2
    val backStack = rememberNavBackStack(Menu)
    NavDisplay(backStack, entryProvider = entryProvider {
        entry<Menu>{
            MenuScreen(modifier = Modifier.fillMaxWidth(),
                onIMCSelected = {backStack.add(IMC)})
        }

        entry<IMC>{
            IMCScreen()
        }
    })
}
package com.example.CursoComposeAristiDev.core

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.CursoComposeAristiDev.features.IMC.IMCResultScreen
import com.example.CursoComposeAristiDev.features.IMC.IMCScreen
import com.example.CursoComposeAristiDev.features.MenuScreen
import com.example.CursoComposeAristiDev.features.settings.SettingsScreen

@Composable
fun AppNavigation() {
    val backStack = rememberNavBackStack(Menu)
    NavDisplay(backStack, entryProvider = entryProvider {
        entry<Menu> {
            MenuScreen(
                modifier = Modifier.fillMaxWidth(),
                onIMCSelected = { backStack.add(IMC) },
                onSettingSelected = {backStack.add(Settings)})
        }
        entry<Settings>{
            SettingsScreen(onBackSelected={backStack.removeLastOrNull()})
        }
        entry<IMC> {
            IMCScreen(
                onResultSelected = { result ->
                    backStack.add(IMCResult(result))
                },
                onBackSelected = {
                    backStack.removeLastOrNull()
                })
        }
        entry<IMCResult> { data ->
            IMCResultScreen(data.result, onBackSelected = { backStack.removeLastOrNull() })
        }
    })
}//fin NavDisplay
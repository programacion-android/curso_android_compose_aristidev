package com.example.CursoComposeAristiDev.core
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

/*Nueva clave de ruta de navegación: IMCResult que recibe
el resultado del BMI o IMC */
@Serializable
data class IMCResult(val result:Float): NavKey

@Serializable
data object Menu: NavKey

@Serializable
data object IMC: NavKey


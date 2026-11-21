package com.example.CursoComposeAristiDev.features.settings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.CursoComposeAristiDev.ui.theme.colorControl
import com.example.CursoComposeAristiDev.ui.theme.colorPrimaryButton
import com.example.CursoComposeAristiDev.ui.theme.colorSecondaryText


@Preview
@Composable
fun usernameSetting(username: String="AristiDev",
                    onUsernameChanged: (String) -> Unit={},
                    onSave: () -> Unit={}) {
    Column(modifier = Modifier.fillMaxWidth().padding(20.dp)){
        OutlinedTextField(value=username, onValueChange = {onUsernameChanged(it)},
            modifier=Modifier.fillMaxWidth(),
            label={Text("Nombre", color=Color.Black)},
            singleLine = true,
            shape= RoundedCornerShape(16.dp),
            colors = TextFieldDefaults.colors(
                focusedTextColor = colorSecondaryText,
                unfocusedTextColor=colorSecondaryText,
                cursorColor = colorControl,
                focusedLabelColor = colorControl,
                unfocusedLabelColor= colorSecondaryText
            )
        )//fin OutlinedTextField
        Spacer(modifier = Modifier.height(16.dp))
       // Button(onClick = onSave){//Ojo!! También funciona asi!
        Button(onClick = {onSave()},
            modifier=Modifier.fillMaxWidth().height(56.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(
                colorPrimaryButton,
                contentColor = Color.White
            )){
            Text("Guardar")
        }//fin Button
    }//fin Column
}//fin usernameSetting
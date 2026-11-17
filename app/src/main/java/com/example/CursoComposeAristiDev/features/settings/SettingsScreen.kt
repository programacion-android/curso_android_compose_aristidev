package com.example.CursoComposeAristiDev.features.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavKey
import com.example.CursoComposeAristiDev.R
import com.example.CursoComposeAristiDev.ui.theme.colorBackgroundComponent
import com.example.CursoComposeAristiDev.ui.theme.colorSecondaryText

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(onBackSelected: () -> Unit = {}) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Ajustes") },
                navigationIcon = {
                    IconButton(onClick = onBackSelected) {
                        Icon(
                            painter = painterResource(R.drawable.ic_back),
                            contentDescription = "Flecha ir atrás: MenuScreen"
                        )
                    }
                })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            //1ª Card para cuenta de usuario o nickName
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorBackgroundComponent
                ),
            ) {
                Text(
                    "CUENTA",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = colorSecondaryText
                )
                TextField(
                    value = "ARIS",
                    onValueChange = {})
            }//fin nickNameCard

            Spacer(modifier = Modifier.height(32.dp))

            Text("PREFERENCIAS")

            //2ª Card para preferencias
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = colorBackgroundComponent
                ),
            ) {
                Column() {
                    Switch(checked = true, onCheckedChange = {})
                    Switch(checked = false, onCheckedChange = {})
                    Switch(checked = true, onCheckedChange = {})
                }
            }
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = {}) {   Text("RESTABLECER AJUSTES")     }

        }
    }//fin Scaffold
}//fin SettingsScreen
@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.example.android_tv.screens.setting


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.tv.material3.Button
import androidx.tv.material3.ButtonColors
import androidx.tv.material3.ButtonDefaults
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text
import com.example.android_tv.ui.theme.Typography

@Composable
fun SettingScreen() {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White).padding(5.dp)) {
        Box(
            modifier = Modifier
                .height(36.5.dp)
                .fillMaxWidth()
        )
        Column(
            modifier = Modifier
                .fillMaxSize().padding(24.dp),

            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,

        ) {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "계정",
                    style = Typography.bodyMedium,
                    fontSize = 12.5.sp
                )

                Box(
                    modifier = Modifier
                        .width(500.dp)
                        .height(1.dp)
                        .background(Color.Gray)
                )

            }

            LogoutButton()


        }

    }
}

@Preview(device = Devices.TV_1080p)
@Composable
fun SettingScreenPreview() {
    SettingScreen()
}

@Composable
fun LogoutButton(){
    Button(

        modifier = Modifier
            .width(251.5.dp)
            .height(49.dp)
            .background(
                color = Color(0xFFEDEDED),
                shape = RoundedCornerShape(size = 10.dp)
            ),
        colors = ButtonDefaults.colors(
            containerColor = Color.Transparent,
            contentColor = Color.Black
        ),
        onClick = { /*TODO*/ },
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "로그 아웃",
            style = Typography.bodyMedium,
            fontSize = 12.5.sp
        )

    }
}
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
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Text
import com.example.android_tv.ui.theme.Typography

@Composable
fun SettingScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize().background(Color.White),

        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(100.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(48.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start,
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                ) {
                    Text(
                        text = "오디오",
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
                VolumeBar()
                VolumeBar()
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(48.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                // Child views.
            }
        }
    }
}

@Preview(device = Devices.TV_1080p)
@Composable
fun SettingScreenPreview() {
    SettingScreen()
}

@Composable
fun VolumeBar() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(48.dp, Alignment.Start),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "명상 음악 소리",

            style = Typography.bodyMedium,
            fontSize = 10.sp
        )


    }
}
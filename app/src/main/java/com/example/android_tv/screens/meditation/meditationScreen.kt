package com.example.android_tv.screens.meditation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface
import com.example.android_tv.R

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun MeditationScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.mm), contentDescription = "meditation", modifier = Modifier.fillMaxSize())
    }
}

@Preview(device = Devices.TV_1080p)
@Composable
fun MeditationScreenPreview() {
    MeditationScreen()
}
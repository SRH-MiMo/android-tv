package com.example.android_tv.screens.meditation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Surface

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun MeditationScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {

    }
}

@Preview(device = Devices.TV_1080p)
@Composable
fun MeditationScreenPreview() {
    MeditationScreen()
}
package com.example.android_tv.screens.analytics

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_tv.R

@Composable
fun AnalyticsScreen() {
Image(painter = painterResource(id = R.drawable.aa), contentDescription = "aa", modifier = Modifier.fillMaxSize())
}

@Preview
@Composable
fun AnalyticsScreenPreview() {
    AnalyticsScreen()
}
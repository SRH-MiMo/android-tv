package com.example.android_tv.screens.home.navigation

sealed class NestedScreens(val title: String) {
    object Home : NestedScreens("home")
    object Analytics : NestedScreens("analytics")
    object Setting : NestedScreens("setting")
}
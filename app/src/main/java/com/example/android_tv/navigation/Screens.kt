package com.example.android_tv.navigation

sealed class Screens(val title: String) {
    object Qr : Screens("qr")
    object Home : Screens("home_screen")

}

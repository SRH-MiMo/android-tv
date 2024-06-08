package com.example.android_tv.screens.home.leftmenu.data

import com.example.android_tv.screens.home.leftmenu.model.MenuItem
import com.example.android_tv.screens.home.navigation.NestedScreens

import compose.icons.LineAwesomeIcons
import compose.icons.lineawesomeicons.CogSolid
import compose.icons.lineawesomeicons.HomeSolid
import compose.icons.lineawesomeicons.ChartBar


object MenuData {
    val menuItems = listOf(
        MenuItem(NestedScreens.Home.title, "Home", LineAwesomeIcons.HomeSolid),
        MenuItem(NestedScreens.Analytics.title, "Analytics", LineAwesomeIcons.ChartBar),
    )

    val settingsItem = MenuItem(
        NestedScreens.Setting.title,
        "Settings",
        LineAwesomeIcons.CogSolid,
    )
}

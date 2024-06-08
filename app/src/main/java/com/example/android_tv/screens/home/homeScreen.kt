@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.example.android_tv.screens.home


import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Text
import com.example.android_tv.screens.home.leftmenu.data.MenuData
import com.example.android_tv.screens.home.navigation.NestedHomeScreenNavigation
import com.example.android_tv.screens.home.navigation.drawer.HomeDrawer
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun HomeScreen() {

    val navController = rememberAnimatedNavController()

    val selectedId = remember {
        mutableStateOf(MenuData.menuItems.first().id)
    }

    HomeDrawer(content = {
        NestedHomeScreenNavigation(navController)
    }, selectedId = selectedId.value) {
        navController.navigate(it.id)
    }
}
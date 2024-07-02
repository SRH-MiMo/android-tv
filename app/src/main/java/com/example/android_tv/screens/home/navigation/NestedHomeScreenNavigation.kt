package com.example.android_tv.screens.home.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.android_tv.screens.analytics.AnalyticsScreen
import com.example.android_tv.screens.home.HomeNestedScreen
import com.example.android_tv.screens.setting.SettingScreen
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable

import com.example.android_tv.navigation.tabEnterTransition
import com.example.android_tv.navigation.tabExitTransition
import com.example.android_tv.screens.meditation.MeditationScreen

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NestedHomeScreenNavigation(
    navController: NavHostController,
) {
    AnimatedNavHost(navController = navController, startDestination = NestedScreens.Home.title) {
        // e.g will add auth routes here if when we will extend project
        composable(
            NestedScreens.Home.title,
            enterTransition = { tabEnterTransition() },
            exitTransition = { tabExitTransition() }) {
            HomeNestedScreen(navController)
        }

        composable(
            NestedScreens.Analytics.title,
            enterTransition = { tabEnterTransition() },
            exitTransition = { tabExitTransition() }) {
            AnalyticsScreen()
        }

        composable(
            NestedScreens.Meditation.title,
            enterTransition = { tabEnterTransition() },
            exitTransition = { tabExitTransition() }) {
            MeditationScreen()
        }

        composable(
            NestedScreens.Setting.title,
            enterTransition = { tabEnterTransition() },
            exitTransition = { tabExitTransition() }) {
            SettingScreen()
        }
    }
}

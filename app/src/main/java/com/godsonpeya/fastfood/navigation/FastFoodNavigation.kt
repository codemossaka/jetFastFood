package com.godsonpeya.fastfood.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.godsonpeya.fastfood.screens.AuthScreen
import com.godsonpeya.fastfood.screens.HomeScreen
import com.godsonpeya.fastfood.screens.SplashScreen
import com.godsonpeya.fastfood.screens.WelcomeScreen

@Composable
fun FastFoodNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = AppScreens.SplashScreen.name) {

        composable(route = AppScreens.SplashScreen.name) {
            SplashScreen(navController = navController)
        }
        composable(route = AppScreens.AuthScreen.name) {
            AuthScreen(navController = navController)
        }
        composable(route = AppScreens.WelcomeScreen.name) {
            WelcomeScreen(navController = navController)
        }
        composable(route = AppScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

    }
}
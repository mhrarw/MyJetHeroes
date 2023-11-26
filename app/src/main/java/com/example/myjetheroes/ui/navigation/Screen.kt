package com.example.myjetheroes.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Profile : Screen("profile")
    object DetailScreen : Screen("detail_screen")
}
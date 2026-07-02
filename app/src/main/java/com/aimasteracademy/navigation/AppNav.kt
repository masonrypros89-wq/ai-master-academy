package com.aimasteracademy.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aimasteracademy.ui.*

@Composable
fun AppNav(navController: NavController) {

    NavHost(navController = navController, startDestination = "home") {

        composable("home") { HomeScreen(navController) }
        composable("learn") { LearnScreen(navController) }
        composable("build") { BuildScreen(navController) }
        composable("mentor") { MentorScreen(navController) }
        composable("lab") { LabScreen(navController) }
    }
}

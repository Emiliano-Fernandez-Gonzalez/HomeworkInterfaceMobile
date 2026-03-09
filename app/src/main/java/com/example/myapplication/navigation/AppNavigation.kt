package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.screen.HomeWorkScreen
import com.example.myapplication.screen.LoginScreen
import com.example.myapplication.screen.SignUpScreen


@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"

    ){
        composable(route = "welcome"){
            HomeWorkScreen(navController)
        }
        composable(route = "login") {
            LoginScreen(navController)
        }
        composable(route = "signup") {
            SignUpScreen(navController)
        }
    }



}
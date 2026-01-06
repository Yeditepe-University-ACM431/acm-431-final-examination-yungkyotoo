package com.yeditepe.finalexam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

        // TODO 1: Add composable for "tasks"
        composable("loginscreen") {LoginScreen(/*...*/)}
        composable("fakeAPIconnection") {fakeAPIconnection()}
        // TODO 2: Add composable for "taskDetail/{title}"
        composable(LoginScreen/{userId})
        arguments= listOf (navArgument ("userId") { type = NavType.stringType })

        composable(fakeAPIconnection/{connected})
        arguments= listOf (navArgument ("connected") { type = NavType.booleanType })
    }
}

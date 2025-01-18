package com.example.deltasoftandroidtask.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.deltasoftandroidtask.ui.screens.ConfirmOrderScreen
import com.example.deltasoftandroidtask.ui.screens.neworderscreen.CreateNewOrderScreen
import com.example.deltasoftandroidtask.ui.screens.homescreen.HomeScreen
import com.example.deltasoftandroidtask.ui.screens.OrderDetailsScreen

@Composable
fun NavigationGraphComposable(modifier: Modifier = Modifier ,navController: NavHostController, startDestination: Routes = Routes.HomeScreen) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
    ){
        composable<Routes.HomeScreen> {
            HomeScreen(modifier = modifier,navController = navController)
        }
        composable<Routes.OrderDetailsScreen> {
            OrderDetailsScreen(modifier = modifier,navController = navController)
        }
        composable<Routes.CreateNewOrderScreen> {
            CreateNewOrderScreen(modifier,navController = navController)
        }
        composable<Routes.ConfirmOrderScreen> {
            ConfirmOrderScreen(modifier,navController = navController)
        }
    }

}
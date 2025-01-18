package com.example.deltasoftandroidtask.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {
    @Serializable
    data object HomeScreen: Routes()

    @Serializable
    data object OrderDetailsScreen: Routes()

    @Serializable
    data object CreateNewOrderScreen: Routes()

    @Serializable
    data object ConfirmOrderScreen: Routes()

}
package com.example.deltasoftandroidtask

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.deltasoftandroidtask.ui.navigation.NavigationGraphComposable
import com.example.deltasoftandroidtask.ui.theme.DeltaSoftAndroidTaskTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            navController = rememberNavController()
            DeltaSoftAndroidTaskTheme {
                Scaffold (Modifier.fillMaxSize()){
                    NavigationGraphComposable(modifier = Modifier.padding(bottom = it.calculateBottomPadding()),navController = navController)

                }
            }
        }
    }
}

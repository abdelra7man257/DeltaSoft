package com.example.deltasoftandroidtask.ui.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun OrderDetailsHeader(modifier: Modifier = Modifier) {

    Row(horizontalArrangement = Arrangement.SpaceAround , modifier = modifier.fillMaxWidth() , verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = "back arrow",
        )
        Text(
            text = "تفاصيل الطلب",
            style = MaterialTheme.typography.titleLarge
        )
        Icon(
            imageVector = Icons.Default.Home,
            contentDescription = "back arrow",
        )
    }
}
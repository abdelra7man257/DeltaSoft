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
fun CreateAndConfirmOrderHeader(modifier: Modifier = Modifier, isHomeVisible:Boolean = true, title:String = "تفاصيل الطلب") {
    Row(horizontalArrangement = Arrangement.SpaceAround , modifier = modifier.fillMaxWidth() , verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = "back arrow",
            tint = MaterialTheme.colorScheme.onPrimary
        )
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge
            ,color = MaterialTheme.colorScheme.onPrimary
        )
        if (isHomeVisible)
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "back arrow",
                tint = MaterialTheme.colorScheme.onPrimary
            )
    }

}
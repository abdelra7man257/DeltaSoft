package com.example.deltasoftandroidtask.ui.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun IconButtonComposable(modifier: Modifier = Modifier,icon: ImageVector) {
    IconButton(onClick = {  },
        modifier = Modifier.background(
            color = MaterialTheme.colorScheme.primary,
            shape = RoundedCornerShape(5.dp)
        ).size(35.dp)) {
        Icon(
            imageVector = icon,
            contentDescription = "Add",
            tint = MaterialTheme.colorScheme.onPrimary
        )
    }

}
package com.example.deltasoftandroidtask.ui.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.deltasoftandroidtask.R

@Composable
fun HomeScreenHeader(modifier: Modifier = Modifier) {
    Row(modifier = modifier
        .fillMaxWidth()
        .padding(10.dp) , verticalAlignment = Alignment.CenterVertically , horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        Image(
            modifier = Modifier.size(50.dp),
            imageVector = ImageVector.vectorResource(R.drawable.ic_launcher_background),
            contentDescription = "logo"
        )
        Column {
            Text(text = "اسم التطبيق"
                ,color = MaterialTheme.colorScheme.onPrimary,
                style = MaterialTheme.typography.titleMedium
            )
            Text(text = "اسم التطبيق"
                ,color = MaterialTheme.colorScheme.onPrimary
                ,style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
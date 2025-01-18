package com.example.deltasoftandroidtask.ui.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.deltasoftandroidtask.R
import com.example.deltasoftandroidtask.ui.theme.DeltaSoftAndroidTaskTheme

@Composable
fun OrderProductItemComposable(modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically ,modifier = Modifier
        .padding(horizontal = 16.dp)
        .fillMaxWidth()
        , ) {
        Image(
            modifier = Modifier.size(50.dp),
            imageVector = ImageVector.vectorResource(id = R.drawable.local_mall),
            contentDescription = "mall icon",
            alignment = Alignment.Center
        )
        Spacer(Modifier.width(20.dp))
        Column(verticalArrangement = Arrangement.Top,modifier = Modifier.weight(1f)) {
            Text(
                text = "29 مارس 2024 , 5:50",
            )
            Text(
                text = "5 منتجات",
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray
            )
            Text(
                text = "300 ",
                color = MaterialTheme.colorScheme.primary
            )
        }

    }
}

@Preview(showBackground = true , showSystemUi = true, locale = "ar")
@Composable
private fun ProductItemPrev() {

    DeltaSoftAndroidTaskTheme {
        OrderProductItemComposable()
    }
    
}
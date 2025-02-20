package com.example.deltasoftandroidtask.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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

@Preview(showBackground = true, showSystemUi = true , locale = "ar")
@Composable
fun AddNewItemComposable(modifier: Modifier = Modifier , onClick: () -> Unit = {}) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .padding(16.dp)
            .border(
                2.dp,
                MaterialTheme.colorScheme.primary.copy(0.8f),
                shape = RoundedCornerShape(8.dp)
            ).clickable { onClick() }
            .fillMaxWidth()
            .height(150.dp)
            .background(MaterialTheme.colorScheme.primary.copy(alpha = 0.1f))
    ) {
        Row {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.local_mall),
                contentDescription = "mall icon",
                tint = Color.Unspecified,
            )
            Spacer(Modifier.width(10.dp))
            Text(
                text = "اضافة طلب جديد"
                ,color = MaterialTheme.colorScheme.primary
            )
        }
    }
}
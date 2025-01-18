package com.example.deltasoftandroidtask.ui.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.deltasoftandroidtask.R
import com.example.deltasoftandroidtask.ui.theme.DeltaSoftAndroidTaskTheme
import com.example.domain.model.ItemsItem

@Composable
fun OrderItemComposable(modifier: Modifier = Modifier , onClick: () -> Unit = {},item: ItemsItem? = null) {
    Row(verticalAlignment = Alignment.CenterVertically ,modifier = Modifier
        .padding(horizontal = 16.dp)
        .fillMaxWidth().clickable { onClick() }
         , ) {
        Box(modifier = Modifier.background(
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
            shape = CircleShape
        )) {
            Icon(
                modifier = Modifier.padding(16.dp),
                imageVector = ImageVector.vectorResource(id = R.drawable.local_mall),
                contentDescription = "mall icon",
                tint = Color.Unspecified,
            )


        }
        Spacer(Modifier.width(20.dp))
        Column(verticalArrangement = Arrangement.Top,modifier = Modifier.weight(1f)) {
            Text(
                text = item?.createdDate.toString()
            )
            Text(
                text = item?.customerUser?.userName.toString(),
                style = MaterialTheme.typography.bodySmall,
                color = Color.Gray
            )
        }

        Text(
            text = item?.priceAfterDiscountTotal.toString()
        )
    }
}

@Preview(showBackground = true , showSystemUi = true , locale = "ar")
@Composable
private fun OrderItemPreview() {
    DeltaSoftAndroidTaskTheme {
        OrderItemComposable()
    }
}
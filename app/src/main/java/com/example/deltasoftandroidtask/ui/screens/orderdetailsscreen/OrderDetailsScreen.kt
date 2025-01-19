package com.example.deltasoftandroidtask.ui.screens.orderdetailsscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.deltasoftandroidtask.ui.theme.DeltaSoftAndroidTaskTheme
import com.example.deltasoftandroidtask.ui.widgets.OrderDetailsComposable
import com.example.deltasoftandroidtask.ui.widgets.OrderDetailsHeader
import com.example.deltasoftandroidtask.ui.widgets.OrderProductItemComposable
import com.example.deltasoftandroidtask.ui.widgets.ReceiptComposable

@Composable
fun OrderDetailsScreen(modifier: Modifier = Modifier , navController: NavController? = null) {
    Surface {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.15f)
                    .background(
                        MaterialTheme.colorScheme.background,
                        shape = RoundedCornerShape(bottomEnd = 10.dp, bottomStart = 10.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                OrderDetailsHeader()
            }
            LazyColumn(
                modifier = modifier
                    .fillMaxSize()
                    .background(Color.Gray.copy(alpha = 0.2f)),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                item {
                    Column(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                    ) {
                        Text(
                            text = "الإثنين 25 اكتوبر 2023 ",
                            style = MaterialTheme.typography.headlineLarge,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "(4:30 PM)",
                            style = MaterialTheme.typography.headlineMedium,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                // Order Details Section
                item {
                    OrderDetailsComposable()
                }

                // Order Items Title
                item {
                    Text(
                        modifier = Modifier.padding(horizontal = 10.dp),
                        text = "عناصر الطلب"
                    )
                }

                // Product Items
                items(count = 3) {
                    OrderProductItemComposable()
                }

                // Receipt Section
                item {
                    ReceiptComposable()
                }
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true, locale = "ar")
@Composable
private fun OrderDetailsScreenPrev() {
    DeltaSoftAndroidTaskTheme {
        OrderDetailsScreen()
    }
}
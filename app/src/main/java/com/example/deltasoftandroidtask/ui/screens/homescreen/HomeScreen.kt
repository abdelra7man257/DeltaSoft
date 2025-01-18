package com.example.deltasoftandroidtask.ui.screens.homescreen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.deltasoftandroidtask.common.UiState
import com.example.deltasoftandroidtask.ui.navigation.Routes
import com.example.deltasoftandroidtask.ui.screens.homescreen.viewmodel.HomeScreenViewModel
import com.example.deltasoftandroidtask.ui.theme.DeltaSoftAndroidTaskTheme
import com.example.deltasoftandroidtask.ui.widgets.AddNewItemComposable
import com.example.deltasoftandroidtask.ui.widgets.HomeScreenHeader
import com.example.deltasoftandroidtask.ui.widgets.OrderItemComposable
import com.example.domain.model.ItemsItem

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavController? = null,
    viewModel: HomeScreenViewModel = hiltViewModel()
) {

    val orderState = viewModel.orderStateFlow.collectAsLazyPagingItems()
    LaunchedEffect(key1 = orderState) {
        viewModel.getAllOrderWithPaging()
        Log.d("TAG", "HomeScreen: ${orderState.itemCount}")
    }
    Surface {
        Column(modifier = modifier) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .background(
                        MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(bottomEnd = 10.dp, bottomStart = 10.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                HomeScreenHeader()
            }

            Column {

                AddNewItemComposable() {
                    navController?.navigate(Routes.CreateNewOrderScreen)
                }

                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = "كل الطلبات"
                )

//            Image(
//                imageVector = ImageVector.vectorResource(R.drawable.empty_cart),
//                contentDescription = "empty cart"
//            )


                LazyColumn(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                    items(items = orderState.itemSnapshotList.items) { item ->
                        OrderItemComposable()
                    }
                }
            }


        }

    }

}

@Preview(showSystemUi = true, showBackground = true, locale = "ar")
@Composable
private fun HomeScreenPrev() {
    DeltaSoftAndroidTaskTheme {
        HomeScreen()
    }

}
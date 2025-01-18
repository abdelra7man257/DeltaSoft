package com.example.deltasoftandroidtask.ui.screens.neworderscreen

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.example.deltasoftandroidtask.R
import com.example.deltasoftandroidtask.ui.navigation.Routes
import com.example.deltasoftandroidtask.ui.screens.neworderscreen.viewmodel.CreateNewOrderViewModel
import com.example.deltasoftandroidtask.ui.theme.DeltaSoftAndroidTaskTheme
import com.example.deltasoftandroidtask.ui.widgets.CreateAndConfirmOrderHeader
import com.example.deltasoftandroidtask.ui.widgets.ProductItemComposable
import com.example.common.ResultWrapper
import com.example.domain.model.searchproductmodel.SearchProductResponseItem
import kotlinx.coroutines.flow.collect


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateNewOrderScreen(modifier: Modifier = Modifier, navController: NavController? = null,
                         viewModel: CreateNewOrderViewModel = hiltViewModel()) {
    var value by remember { mutableStateOf("") }
    val state = viewModel.search.collectAsStateWithLifecycle()
    var list by remember { mutableStateOf<List<SearchProductResponseItem?>?>(emptyList())}
    var showLoading by remember { mutableStateOf(false) }
    var showError by remember { mutableStateOf<Pair<Boolean,String?>>(Pair(false,null)) }

    LaunchedEffect(state.value) {
        viewModel.search.collect{
            when(it)
            {
                is ResultWrapper.Error -> {
                    showError = Pair(true,it.error.localizedMessage)
                    showLoading = false
                }
                ResultWrapper.Loading -> {
                    showLoading = true
                }
                is ResultWrapper.ServerException -> {
                    showError = Pair(true,it.serverError.localizedMessage)
                    showLoading = false
                }
                is ResultWrapper.Success -> {
                    list = it.data
                    showLoading = false
                    Log.d("TAG", "CreateNewOrderScreen: ${it.data}")
                }
            }
        }
    }
    Box(
        modifier = modifier,
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.15f)
                    .background(
                        MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(bottomEnd = 10.dp, bottomStart = 10.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                CreateAndConfirmOrderHeader()
            }
            SearchBar(
                shape = RoundedCornerShape(10.dp),
                inputField = {
                    SearchBarDefaults.InputField(
                        query = value,
                        onQueryChange = {
                            value = it
                        },
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent
                        ),
                        onSearch = {},
                        expanded = false,
                        onExpandedChange = {},
                        enabled = true,
                        placeholder = {
                            Text(
                                text = "بحث بالإسم او الباركود",
                                color = Color.Gray.copy(0.5f)
                            )
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = ImageVector.vectorResource(id = R.drawable.search),
                                contentDescription = "Search Icon",
                                tint = Color.Unspecified,
                            )
                        },
                    )
                },
                expanded = false,
                onExpandedChange = {},
            ) {}

            LazyVerticalGrid(
                modifier = Modifier.padding(horizontal = 10.dp),
                columns = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(items = list!!,key = {it?.id!!}) {
                    ProductItemComposable(searchProductResponseItem = it)
                }
            }

        }
        ExtendedFloatingActionButton(
            modifier = Modifier.padding(16.dp),
            onClick = { navController?.navigate(Routes.ConfirmOrderScreen) },
            containerColor = MaterialTheme.colorScheme.primary,
            elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 20.dp),
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "انشاء الطلب")
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(30.dp)
                        .background(
                            color = MaterialTheme.colorScheme.onPrimary,
                            shape = CircleShape
                        )
                ) {
                    Text(
                        "3",
                        Modifier.align(Alignment.Center),
                        color = MaterialTheme.colorScheme.primary,
                        textAlign = TextAlign.Center
                    )

                }
                Text("450 جنيه")
                Icon(imageVector = Icons.AutoMirrored.Filled.ArrowForward, contentDescription = "")
            }
        }
    }
}

@Preview(showBackground = true, locale = "ar")
@Composable
private fun CreateNewOrderScreenPreview() {

    DeltaSoftAndroidTaskTheme {
        CreateNewOrderScreen()
    }

}
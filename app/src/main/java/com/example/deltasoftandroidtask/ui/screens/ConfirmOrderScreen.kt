package com.example.deltasoftandroidtask.ui.screens

import ConfirmationDialogComposable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.deltasoftandroidtask.R
import com.example.deltasoftandroidtask.ui.components.OutLinedInputTextFieldComposable
import com.example.deltasoftandroidtask.ui.theme.DeltaSoftAndroidTaskTheme
import com.example.deltasoftandroidtask.ui.widgets.CreateAndConfirmOrderHeader
import com.example.deltasoftandroidtask.ui.widgets.OrderProductItemComposable

@Composable
fun ConfirmOrderScreen(modifier: Modifier = Modifier, navController: NavController? = null) {
    val isShown = remember { mutableStateOf(false) }
    Box (modifier = modifier.background(Color.White)){
        Column(Modifier.fillMaxSize()) {
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
            Row(
                horizontalArrangement = Arrangement.spacedBy(5.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 5.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth(0.5f)
                        .height(60.dp)
                        .background(
                            color = Color.Gray.copy(alpha = 0.5f),
                            shape = RoundedCornerShape(8.dp)
                        ),
                ) {
                    Text(
                        "نقدي"
                    )
                }

                OutLinedInputTextFieldComposable(value = "", onValueChange = {})


            }
            Text("بيانات الطلب", style = MaterialTheme.typography.titleLarge)

            OutLinedInputTextFieldComposable(
                Modifier.fillMaxWidth(),
                value = "",
                onValueChange = {})
            OutLinedInputTextFieldComposable(
                Modifier.fillMaxWidth(),
                value = "",
                onValueChange = {})
            Text("عناصر الطلب", style = MaterialTheme.typography.titleLarge)
            LazyColumn {

                items(20) {
                    OrderProductItemComposable()
                }
            }

        }

        Button(onClick = {
            isShown.value = true
        },
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .padding(vertical = 10.dp)
                .align(Alignment.BottomCenter),
            contentPadding = PaddingValues(10.dp),
            colors = ButtonColors(
                containerColor = Color(0xFF47B881),
                contentColor = Color.White,
                disabledContainerColor = Color.Gray,
                disabledContentColor = Color.Black
            ),
            shape = RoundedCornerShape(10.dp)) {
            Text(text = "تأكيد الطلب" , )
        }
        ConfirmationDialogComposable(
            R.drawable.confirm, "تمت الطلب بنجاح",
            displayTimeMillis = 300,
            onDismiss = {}
        )
    }
}

@Preview(showBackground = true, locale = "ar")
@Composable
private fun ConfirmOrderScreenPrev() {
    DeltaSoftAndroidTaskTheme {
        ConfirmOrderScreen()
    }

}
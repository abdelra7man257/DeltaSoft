package com.example.deltasoftandroidtask.ui.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true, showBackground = true, locale = "ar")
@Composable
fun ReceiptComposable(modifier: Modifier = Modifier) {
    Surface {
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "العمليات"
            )
            ReceiptComponent(label = "xxxxx", value = "xxxxxxx")
            ReceiptComponent(label = "xxxxx", value = "xxxxxxx")
            ReceiptComponent(label = "xxxxx", value = "xxxxxxx")
        }
    }
}

@Composable
private fun ReceiptComponent(modifier: Modifier = Modifier, label: String, value: String) {
    Row(modifier.fillMaxWidth().padding(8.dp) , horizontalArrangement = Arrangement.SpaceBetween) {
        Text(
            text = label
        )
        Text(
            text = value
        )
    }
}
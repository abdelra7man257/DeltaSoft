package com.example.deltasoftandroidtask.ui.widgets
//
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//
//@Composable
//fun OrderDetailsComposable(modifier: Modifier = Modifier) {
//
//}
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true , showBackground = true , locale = "ar")
@Composable
fun OrderDetailsComposable() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .background(color = MaterialTheme.colorScheme.background , shape = RoundedCornerShape(10.dp))
            .padding(20.dp)

    ) {
        // Title
        Text(
            text = "بيانات الطلب",
            fontSize = 18.sp,
            modifier = Modifier
                .padding(bottom = 8.dp)
        )

        // Divider
        HorizontalDivider(
            color = Color.Gray.copy(alpha = 0.1f),
            thickness = 1.dp,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Customer Name
        DetailItem(label = "اسم العميل", value = "محمد احمد جمعة")

        // Phone Number
        DetailItem(label = "رقم الهاتف", value = "01025149578")

        // Address
        DetailItem(label = "العنوان", value = "المنصورة شارع الجيش")
    }
}

@Composable
fun DetailItem(label: String, value: String) {
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(
            text = label,
            fontSize = 14.sp,
            color = Color.Gray
        )
        Text(
            text = value,
            fontSize = 16.sp,
        )
    }
}

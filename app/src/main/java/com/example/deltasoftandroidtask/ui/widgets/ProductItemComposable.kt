package com.example.deltasoftandroidtask.ui.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.rememberAsyncImagePainter
import com.example.deltasoftandroidtask.R
import com.example.deltasoftandroidtask.ui.theme.DeltaSoftAndroidTaskTheme
import com.example.domain.model.searchproductmodel.SearchProductResponseItem

@Composable
fun ProductItemComposable(modifier: Modifier = Modifier , searchProductResponseItem: SearchProductResponseItem?=null) {

    Box(
        modifier.border(
            width = 1.5.dp,
            color = Color.Gray.copy(alpha = 0.5f),
            shape = RoundedCornerShape(10.dp)
        )
    ) {
        Column(Modifier.padding( 16.dp) , horizontalAlignment = Alignment.CenterHorizontally) {
            Row (Modifier.fillMaxWidth() , horizontalArrangement = Arrangement.SpaceBetween ,){
                Image(
                    painter = rememberAsyncImagePainter(searchProductResponseItem?.image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Text(
                    text = searchProductResponseItem?.price.toString()
                    , color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.background(MaterialTheme.colorScheme.primary.copy(alpha = 0.2f),
                        shape = RoundedCornerShape(3.dp)
                    ).padding(horizontal = 5.dp , vertical = 2.dp),
                )
            }
            Text(
                text = searchProductResponseItem?.name.toString(),
                modifier = Modifier.fillMaxWidth(),
                maxLines = 1,

            )
            Text(
                text = searchProductResponseItem?.merchantProducts?.get(0)?.maxQuantity.toString(),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(10.dp))
            ProductQuantityIdentifier()

//            Button(onClick = {} , shape = RoundedCornerShape(10.dp) , modifier = Modifier.fillMaxWidth()) {
//                Text(text = "اضف الى السلة")
//            }
        }

    }

}

@Preview(showBackground = true , showSystemUi = true , locale = "ar")
@Composable
private fun ProductItemPreview() {
    DeltaSoftAndroidTaskTheme {
        LazyVerticalGrid(modifier =  Modifier.padding(horizontal = 10.dp), columns = GridCells.Fixed(2) , horizontalArrangement = Arrangement.spacedBy(10.dp) , verticalArrangement = Arrangement.spacedBy(10.dp)) {
            items(count = 10){
                ProductItemComposable()
            }
        }
    }
}
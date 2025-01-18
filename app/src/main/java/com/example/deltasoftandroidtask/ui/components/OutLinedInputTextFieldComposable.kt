package com.example.deltasoftandroidtask.ui.components

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun OutLinedInputTextFieldComposable(modifier: Modifier = Modifier , value: String="" , onValueChange: (String) -> Unit={} ,label:String="" ) {

   OutlinedTextField(
       modifier = modifier,
       value = value,
       onValueChange = onValueChange,
       label = { Text(label)},
   )
}
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.AlertDialog
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun ConfirmationDialogComposable(
    image: Int, // Pass the image as a Painter
    text: String, // Pass the text to be displayed
    displayTimeMillis: Long = 3000, // Duration for the dialog to appear
    onDismiss: () -> Unit // Callback for when the dialog is dismissed
) {
    var isVisible by remember { mutableStateOf(true) }

    // Automatically dismiss the dialog after a certain time
    LaunchedEffect(Unit) {
        delay(displayTimeMillis)
        isVisible = false
        onDismiss()
    }

    if (isVisible) {
        AlertDialog(
            onDismissRequest = { isVisible = false },
            buttons = {}, // No buttons
            backgroundColor = Color.White,
            contentColor = Color.Black,
            title = null,
            text = {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(16.dp)
                ) {
                    // Image
                    Image(
                        imageVector =ImageVector.vectorResource(id = image),
                        contentDescription = "Dialog Image",
                        modifier = Modifier.size(100.dp)
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Text
                    androidx.compose.material.Text(
                        text = text,
                        style = TextStyle(fontSize = 16.sp),
                        modifier = Modifier.padding(top = 8.dp)
                    )
                }
            }
        )
    }
}

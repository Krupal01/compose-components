/*


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.compose_components.R

@Composable
fun ConfirmDialog(
    title: String,
    text: String,
    btnPositive: String = stringResource(id = R.string.yes),
    btnNegative: String = stringResource(id = R.string.no),
    onConfirm: () -> Unit,
    onCancel: () -> Unit
) {
    Dialog(onDismissRequest = onCancel) {

        Card(shape = RoundedCornerShape(10.dp), colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface), modifier = Modifier.clipToBounds()) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = title, style = TextStyle(fontSize = 20.sp, color = DarkBlue , fontWeight = FontWeight.SemiBold))
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = text,
                    style = TextStyle(fontSize = 16.sp, color = DarkBlue),
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(
                        onClick = onConfirm,
                        colors = ButtonDefaults.buttonColors(containerColor = GreenColor),
                        shape = RoundedCornerShape(5.dp),
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(text = btnPositive, style = TextStyle(color = Color.White, fontSize = 18.sp))
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    OutlinedButton(
                        onClick = onCancel,
                        shape = RoundedCornerShape(5.dp),
                        modifier = Modifier.weight(1f) ,
                        border= BorderStroke(1.dp, DarkBlue),
                    ) {
                        Text(
                            text = btnNegative,
                            style = TextStyle(color = DarkBlue, fontSize = 18.sp)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true , showSystemUi = true)
@Composable
fun PreviewConfirmDialog() {
    ConfirmDialog(
        title = "Delete Item",
        text = "Are you sure you want to delete this item ?",
        onConfirm = { */
/*TODO*//*
 },
        onCancel = { */
/*TODO*//*
 }
    )
}*/

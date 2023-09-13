/*


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.app.compose_components.R
import com.app.compose_components.common.LocalZebraDevice
import com.app.compose_components.theme.DarkBlue
import com.app.compose_components.theme.DropDownTintColor
import com.app.compose_components.theme.TextFiledTintColor
import com.app.compose_components.theme.textStyleLabel
import kotlinx.coroutines.launch

@Composable
fun DropDownText(
    modifier: Modifier = Modifier,
    headingText: String,
    value: String,
    textStyle: TextStyle = TextStyle.Default,
    showBarcode: Boolean = false,
    isEnable: Boolean = true,
    onClickTrailingIcon: () -> Unit = {},
    showClose: Boolean = false,
    onDropDownClick: () -> Unit = {},
    focusFiled: FocusRequester = remember { FocusRequester() },
    isFocused: Boolean = false,
    onClose: () -> Unit = {},
    onClick: () -> Unit = {},
    onFocus: () -> Unit = {}
) {
    val showWarningDialog = remember {
        mutableStateOf(false)
    }
    var isFocus by remember {
        mutableStateOf(false)
    }
    val isZebraDevice = LocalZebraDevice.current

    */
/*val focusFiled = remember {
        FocusRequester()
    }*//*

    val scope = rememberCoroutineScope()

    Column(
        modifier = modifier
            .clickable {
                scope.launch {
                    focusFiled.requestFocus()
                }
                if (isFocus || !showBarcode)
                    onClick()
                else
                    onFocus()
            }
            .focusRequester(focusFiled)
            .onFocusChanged {
                isFocus = it.isFocused
                if(isFocus){
                    onFocus()
                }
            }
            .focusable()
            .alpha(if (isEnable) 1f else 0.4f)
    ) {
        Text(text = headingText, style = textStyleLabel)

        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 2.dp, bottom = 6.dp)
        ) {
            Text(text = value, style = textStyle, modifier = Modifier.weight(1f))
            Icon(
                modifier = Modifier.clickable {
                    if (showClose) {
                        onClose()
                    } else {
                        onDropDownClick()
                    }
                },
                imageVector = if (showClose) {
                    Icons.Default.Close
                } else {
                    Icons.Default.KeyboardArrowDown
                },
                contentDescription = null,
            )
            if (showBarcode) {
                Spacer(modifier = Modifier.size(6.dp))
                Image(
                    painter = painterResource(id = R.drawable.ic_barcode),
                    contentDescription = null,
                    colorFilter = ColorFilter.tint(DarkBlue),
                    modifier = Modifier
                        .size(width = 25.dp, height = 23.dp)
                        */
/*.clickable(
                            onClick = if (isEnable) {
                                if (isZebraDevice) {
                                    onClickTrailingIcon
                                } else {
                                    {
                                        showWarningDialog.value = true
                                    }
                                }
                            } else {
                                {}
                            }
                        )*//*

                )
            }
        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(color = if (isFocus) MaterialTheme.colorScheme.primary else DropDownTintColor)
        )
    }

    if (showWarningDialog.value) {
        compose_componentsDialog(
            text = stringResource(R.string.scanning_unable_to_support_please_use_zebra_devices),
            onConfirmClick = {
                showWarningDialog.value = false
            },
            onDismissRequest = {
                showWarningDialog.value = false
            }
        )
    }

    LaunchedEffect(key1 = isFocused, block = {
        if(isFocused) {
            focusFiled.requestFocus()
        }
    })
}*/

/*
package com.app.compose_components.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.indicatorLine
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.compose_components.R
import com.app.compose_components.common.LocalZebraDevice
import com.app.compose_components.theme.DarkBlue
import com.app.compose_components.theme.compose_componentsTheme
import com.app.compose_components.theme.TextFiledTintColor
import com.app.compose_components.theme.textStyleLabel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeadingTextFiled(
    headingText: String,
    value: String,
    onValueChange: (String) -> Unit = {},
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    singleLine: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    isError: Boolean = false,
    contentPadding: PaddingValues = PaddingValues(top = 2.dp, bottom = 6.dp),
    textStyle: TextStyle = TextStyle.Default,
    colors: TextFieldColors = TextFieldDefaults.textFieldColors(
        containerColor = Color.Transparent,
        unfocusedIndicatorColor = TextFiledTintColor,
        disabledIndicatorColor = TextFiledTintColor
    ),
    trailingIcon: @Composable (() -> Unit)? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    requestFocus: FocusRequester = remember { FocusRequester() },
    disableAlpha: Float = 0.4f,
    isContainerEnabled: Boolean = true,
    showBarcode: Boolean = false,
    showCalender: Boolean = false,
    onClickTrailingIcon: () -> Unit = {},
) {

    val showWarningDialog = remember {
        mutableStateOf(false)
    }
    val isZebraDevice = LocalZebraDevice.current

    Column(modifier = modifier
        .alpha(if (isContainerEnabled) 1f else disableAlpha)
        .clickable(
            onClick = if (isContainerEnabled){
                if(isZebraDevice) {
                    onClickTrailingIcon
                }else {
                    {
                        showWarningDialog.value = true
                    }
                }
            } else {
                {}
            }
        )
    ) {
        Text(text = headingText, style = textStyleLabel)

        BasicTextField(
            modifier = Modifier
                .fillMaxWidth()
                .focusRequester(requestFocus),
            value = value,
            onValueChange = onValueChange,
            textStyle = textStyle.copy(color = DarkBlue),
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            interactionSource = interactionSource,
            readOnly = readOnly,
            enabled = enabled && isContainerEnabled,
            singleLine = singleLine,
            visualTransformation = visualTransformation,
            maxLines = maxLines,
            minLines = minLines,
        ) {
            Row(
                modifier = Modifier
                    .indicatorLine(enabled, isError, interactionSource, colors)
                    .padding(contentPadding)
                    .height(intrinsicSize = IntrinsicSize.Max),
                verticalAlignment = Alignment.Bottom
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    it()
                }
                Row {
                    trailingIcon?.invoke()
                    if (showCalender) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_calendar),
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(DarkBlue),
                            modifier = Modifier
                                .size(22.dp)
                                .padding(2.dp)
                                .clickable(
                                    onClick = if (isContainerEnabled)
                                        onClickTrailingIcon
                                    else {
                                        {}
                                    }
                                )
                        )
                    }
                    if (showBarcode) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_barcode),
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(DarkBlue),
                            modifier = Modifier
                                .size(width = 25.dp, height = 23.dp)
                                */
/*.clickable(
                                    onClick = if (isContainerEnabled){
                                        if(isZebraDevice) {
                                            onClickTrailingIcon
                                        }else {
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
            }
        }
    }

    if(showWarningDialog.value) {
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
}


@Preview(showBackground = true)
@Composable
fun HeadingTextFiledPreview() {
    compose_componentsTheme {
        HeadingTextFiled(
            "Username",
            "Text",
            {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}*/

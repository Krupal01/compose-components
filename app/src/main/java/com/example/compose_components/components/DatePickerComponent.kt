/*
package com.app.compose_components.presentation.components

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.ui.res.stringResource
import java.util.Date

@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerComponent(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    onDateSelect: (Long?) -> Unit,
) {
    val datePickerState = rememberDatePickerState(initialSelectedDateMillis = Date().time)
    val confirmEnabled = derivedStateOf { datePickerState.selectedDateMillis != null }

    if(showDialog) {
        DatePickerDialog(
            onDismissRequest = onDismiss,
            confirmButton = {
                TextButton(
                    onClick = {
                        onDateSelect(datePickerState.selectedDateMillis)
                        onDismiss()
                    },
                    enabled = confirmEnabled.value
                ) {
                    Text(stringResource(id = R.string.ok))
                }
            },
            dismissButton = {
                TextButton(
                    onClick = onDismiss
                ) {
                    Text(stringResource(id = R.string.cancel))
                }
            }
        ) {
            DatePicker(state = datePickerState)
        }
    }
}*/

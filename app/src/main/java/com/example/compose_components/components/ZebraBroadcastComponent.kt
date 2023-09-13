/*
package com.app.compose_components.presentation.components

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import com.app.compose_components.common.COM_SYMBOL_DATAWEDGE_DATA_STRING
import com.app.compose_components.common.COM_SYMBOL_DATAWEDGE_LABEL_TYPE
import com.app.compose_components.common.COM_SYMBOL_DATAWEDGE_compose_components
import com.app.compose_components.model.BarcodeModel

@Composable
fun ZebraBroadcastComponent(
    onResult: (BarcodeModel) -> Unit,
) {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    
    val zebraBroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            Log.d("Zebra Broadcast", "onReceive: ${intent?.getStringExtra(COM_SYMBOL_DATAWEDGE_DATA_STRING)} ${intent?.getStringExtra(COM_SYMBOL_DATAWEDGE_LABEL_TYPE)}")

            val barcode = intent?.getStringExtra(COM_SYMBOL_DATAWEDGE_DATA_STRING) ?: ""
            val barcodeFormat = intent?.getStringExtra(COM_SYMBOL_DATAWEDGE_LABEL_TYPE) ?: ""
            if (barcodeFormat.isNotEmpty() && barcodeFormat.split("-").lastOrNull() != null) {
                onResult(BarcodeModel(barcode, barcodeFormat))
            }
        }
    }

    DisposableEffect(lifecycleOwner) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_START) {
                context.registerReceiver(
                    zebraBroadcastReceiver,
                    IntentFilter(COM_SYMBOL_DATAWEDGE_compose_components)
                )
            } else if (event == Lifecycle.Event.ON_STOP) {
                context.unregisterReceiver(zebraBroadcastReceiver)
            }
        }

        lifecycleOwner.lifecycle.addObserver(observer)

        onDispose {
            lifecycleOwner.lifecycle.removeObserver(observer)
        }
    }
}
*/

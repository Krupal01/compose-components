/*
package com.app.compose_components.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import com.app.compose_components.theme.itemTextStyleTable
import com.app.compose_components.theme.titleTextStyleTableHeader

@Composable
fun DynamicTableItemRow(
    modifier: Modifier = Modifier,
    valueList: List<ItemRow> = emptyList(),
    headerWeightArray: FloatArray = FloatArray(valueList.size){ 1f },
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalAlignment: Alignment.Vertical = Alignment.Top,
    itemMaxLine: Int = Int.MAX_VALUE,
    action: @Composable (() -> Unit)? = null,
) {

    Row(
        modifier = modifier,
        verticalAlignment = verticalAlignment,
        horizontalArrangement = horizontalArrangement,
    ) {
        valueList.forEachIndexed { index, item ->
            if (index == valueList.size - 1 && action != null) {
                action()
            }else {
                Text(
                    text = item.value,
                    modifier = (item.modifier ?: Modifier).weight(headerWeightArray[index]),
                    style = item.textStyle ?: itemTextStyleTable,
                    maxLines = itemMaxLine,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

data class ItemRow(
    val value: String,
    val textStyle: TextStyle? = null,
    val modifier: Modifier? = null
)*/

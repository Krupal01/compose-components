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
fun TableItemRow(
    modifier: Modifier = Modifier,
    isHeader: Boolean = false,
    valueList: List<String> = emptyList(),
    itemTextStyle: TextStyle = itemTextStyleTable,
    headerTextStyle: TextStyle = titleTextStyleTableHeader,
    headerWeightArray: FloatArray = FloatArray(valueList.size){ 1f },
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalAlignment: Alignment.Vertical = Alignment.Top,
    itemMaxLine: Int = Int.MAX_VALUE,
    action: @Composable (() -> Unit)? = null,
) {
    val textStyle: TextStyle = if (isHeader) {
        headerTextStyle
    } else {
        itemTextStyle
    }

    Row(
        modifier = modifier,
        verticalAlignment = verticalAlignment,
        horizontalArrangement = horizontalArrangement,
    ) {
        valueList.forEachIndexed { index, s ->
            if (index == valueList.size - 1 && action != null) {
                action()
            }else {
                Text(
                    text = s,
                    modifier = Modifier.weight(headerWeightArray[index]),
                    style = textStyle,
                    maxLines = itemMaxLine,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}*/

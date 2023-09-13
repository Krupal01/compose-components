/*
package com.app.compose_components.presentation.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.app.compose_components.R
import com.app.compose_components.theme.DarkBlue
import com.app.compose_components.theme.titleTextStyleLabel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun compose_componentsToolbar(
    title: String,
    onBack: (() -> Unit)? = null,
    actions: @Composable RowScope.() -> Unit = {},
    elevation: Dp = 6.dp,
    titlePadding: PaddingValues = PaddingValues(0.dp)
) {
    Surface(shadowElevation = elevation) {
        TopAppBar(
            title = {
                Text(text = title, style = titleTextStyleLabel, modifier = Modifier.offset(x = (-6).dp).padding(titlePadding))
            },
            navigationIcon = onBack?.let {
                {
                    IconButton(onClick = it) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.ic_back),
                            contentDescription = null,
                            modifier = Modifier.size(30.dp),
                            tint = DarkBlue
                        )
                    }
                }
            } ?: {},
            actions = actions
        )
    }

}*/

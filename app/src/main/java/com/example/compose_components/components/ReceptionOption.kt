/*
package com.app.compose_components.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.compose_components.theme.DarkBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReceptionOption(
    iconId: Int,
    labelText: String,
    isSelected: Boolean,
    isShowBadged: Boolean = false,
    onClick: () -> Unit
) {
    val color = if (isSelected) DarkBlue else Color.Gray
    BadgedBox(
        badge = { if (isSelected && isShowBadged) CheckBadge() },
        modifier = Modifier
            .padding(horizontal = 30.dp)
            .clickable {
                if (isSelected) {
                    onClick()
                }
            }
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .border(width = 1.dp, color = color)
                .background(color = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
            ) {
                Image(
                    painter = painterResource(id = iconId),
                    colorFilter = ColorFilter.tint(color = color),
                    contentDescription = "",
                    modifier = Modifier
                        .height(80.dp)
                        .width(80.dp)
                        .padding(top = 20.dp)
                )
                Text(
                    text = labelText,
                    modifier = Modifier.padding(bottom = 16.dp),
                    color = color,
                    fontSize = 18.sp
                )
            }

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CheckBadge() {
    Badge(
        modifier = Modifier
            .size(30.dp)
            .offset(x = (-12).dp, y = 6.dp),
        containerColor = DarkBlue,
        contentColor = Color.White,
        content = {
            Icon(imageVector = Icons.Default.Check, contentDescription = "", tint = Color.White)
        }
    )
}*/

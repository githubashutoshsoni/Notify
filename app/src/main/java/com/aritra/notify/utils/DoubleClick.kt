package com.aritra.notify.utils

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

/*
@Composable
fun DoubleClickable(
    onClick: () -> Unit,
    onDoubleClick: () -> Unit,
    content: @Composable () -> Unit
) {
    var clickCount by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier.clickable {
            clickCount++
            if (clickCount == 1) {
                // First click, start a coroutine to wait for a second click
                LaunchedEffect(key1 = Unit) {
                    delay(250) // You can adjust the time window here
                    if (clickCount == 1) {
                        onClick()
                    }
                    clickCount = 0
                }
            } else {
                // Second click happened within the time window, trigger double-click
                onDoubleClick()
                clickCount = 0
            }
        }
    ) {
        content()
    }
}*/

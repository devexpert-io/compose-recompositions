package io.devexpert.composerecompositions.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import io.devexpert.composerecompositions.ui.screens.shared.Screen
import io.devexpert.composerecompositions.ui.screens.shared.TopBar

@Composable
fun DeferRead() {
    Screen {
        Scaffold(
            topBar = { TopBar("Defer Read") }
        ) { padding ->
            var sliderValue by remember { mutableFloatStateOf(0f) }
            Column(
                modifier = Modifier
                    .padding(padding)
                    .padding(horizontal = 16.dp)
            ) {
                Slider(value = sliderValue, onValueChange = { sliderValue = it })
                RedBall(offset = { sliderValue * 200 })
            }
        }
    }
}

@Composable
fun RedBall(offset: () -> Float) {
    Box(
        modifier = Modifier
            .offset { IntOffset(offset().toInt(), 0) }
            .size(56.dp)
            .clip(CircleShape)
            .background(Color.Red)
    )
}
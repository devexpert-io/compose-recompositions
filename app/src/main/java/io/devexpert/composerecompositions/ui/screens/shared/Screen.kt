package io.devexpert.composerecompositions.ui.screens.shared

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.devexpert.composerecompositions.ui.theme.ComposeRecompositionsTheme

@Composable
fun Screen(content: @Composable () -> Unit) {
    ComposeRecompositionsTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
            content = content
        )
    }
}
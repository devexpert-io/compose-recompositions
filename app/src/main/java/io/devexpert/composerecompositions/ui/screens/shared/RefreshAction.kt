package io.devexpert.composerecompositions.ui.screens.shared

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable

@Composable
fun RefreshAction(onClick: () -> Unit){
    TopBarAction(
        imageVector = Icons.Default.Refresh,
        contentDescription = "Refresh",
        onClick = onClick
    )
}
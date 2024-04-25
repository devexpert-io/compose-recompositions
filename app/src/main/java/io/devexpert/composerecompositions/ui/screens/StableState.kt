package io.devexpert.composerecompositions.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import io.devexpert.composerecompositions.ui.screens.shared.Screen
import io.devexpert.composerecompositions.ui.screens.shared.TopBar

data class Contact(var name: String)

@Composable
fun StableState() {
    Screen {
        Scaffold(
            topBar = { TopBar("Stable State") }
        ) { padding ->

            val contact = remember { Contact("John Doe") }
            var selected by remember { mutableStateOf(false) }

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                ContactDetail(contact)
                ToggleHeart(
                    checked = selected,
                    onCheckedChange = { selected = it }
                )
            }

        }
    }

}

@Composable
private fun ContactDetail(contact: Contact) {
    Text(
        text = contact.name,
        style = MaterialTheme.typography.headlineSmall
    )
}

@Composable
fun ToggleHeart(checked: Boolean, onCheckedChange: (Boolean) -> Unit) {
    IconToggleButton(checked, onCheckedChange) {
        Icon(
            imageVector = if (checked) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
            contentDescription = "Favorite"
        )
    }
}

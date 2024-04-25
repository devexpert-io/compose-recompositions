package io.devexpert.composerecompositions.ui.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import io.devexpert.composerecompositions.data.buildMovies
import io.devexpert.composerecompositions.ui.screens.shared.Screen
import io.devexpert.composerecompositions.ui.screens.shared.TopBar
import io.devexpert.composerecompositions.ui.screens.shared.TopBarAction
import kotlinx.coroutines.launch

@Composable
fun DerivedState() {

    val scope = rememberCoroutineScope()
    val lazyState = rememberLazyListState()
    val showScrollToTop by remember { derivedStateOf { lazyState.firstVisibleItemIndex > 0 } }

    Screen {
        Scaffold(
            topBar = {
                TopBar("Derived State") {
                    if (showScrollToTop) {
                        TopBarAction(
                            imageVector = Icons.Default.KeyboardArrowUp,
                            contentDescription = "Scroll to top",
                            onClick = {
                                scope.launch {
                                    lazyState.scrollToItem(0)
                                }
                            }
                        )
                    }
                }
            }
        ) { padding ->
            LazyColumn(
                state = lazyState,
                contentPadding = padding
            ) {
                items(buildMovies(100), key = { it.id }) {
                    MovieItem(movie = it)
                }
            }
        }
    }
}
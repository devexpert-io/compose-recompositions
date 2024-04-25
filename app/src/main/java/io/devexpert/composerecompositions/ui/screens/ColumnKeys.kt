package io.devexpert.composerecompositions.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import io.devexpert.composerecompositions.data.buildMovies
import io.devexpert.composerecompositions.ui.screens.shared.RefreshAction
import io.devexpert.composerecompositions.ui.screens.shared.Screen
import io.devexpert.composerecompositions.ui.screens.shared.TopBar

@Composable
fun ColumnKeys() {
    Screen {
        var movies by remember { mutableStateOf(buildMovies(4)) }
        Scaffold(
            topBar = {
                TopBar("Column Keys") {
                    RefreshAction { movies = movies.shuffled() }
                }
            }
        ) { padding ->
            Column(
                modifier = Modifier.padding(padding)
            ) {
                for (movie in movies) {
                    key(movie.id) {
                        MovieItem(movie = movie)
                    }
                }
            }
        }
    }
}

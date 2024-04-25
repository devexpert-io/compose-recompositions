package io.devexpert.composerecompositions.data

data class Movie (
    val id: Int,
    val title: String,
    val description: String,
    val image: String
)

fun buildMovies(count: Int) = (1..count).map {
    Movie(
        id = it,
        title = "Movie $it",
        description = "Description $it",
        image = "https://picsum.photos/100/100?id=$it")
}
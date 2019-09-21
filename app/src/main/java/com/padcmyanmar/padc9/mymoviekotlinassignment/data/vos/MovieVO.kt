package com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos

data class MovieVO(

    val id: Int,
    val movieName: String,
    val imdb: Double,
    val rottenTomato: Int,
    val metaCentric: Int,
    val genre: List<GenreVO>,
    val overview: String,
    val poster: String
) {
}
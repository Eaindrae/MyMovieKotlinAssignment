package com.padcmyanmar.padc9.mymoviekotlinassignment.data.models

import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO

interface MovieModel {

    fun getAllMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit)

    fun findMovieById(movieId: Int): MovieVO
}
package com.padcmyanmar.padc9.mymoviekotlinassignment.network.dataAgents

import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO

interface MovieDataAgents {

    fun getMovies(

        onSuccess: (List<MovieVO>) -> Unit,
        onFailure: (String) -> Unit
    )
}
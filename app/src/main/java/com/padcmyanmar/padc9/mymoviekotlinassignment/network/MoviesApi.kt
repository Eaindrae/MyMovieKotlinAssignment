package com.padcmyanmar.padc9.mymoviekotlinassignment.network


import com.padcmyanmar.padc9.mymoviekotlinassignment.network.responses.GetMovieResponse
import com.padcmyanmar.padc9.mymoviekotlinassignment.utils.GET_MOVIES
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MoviesApi {

    @POST(GET_MOVIES)
    fun getAllMovies():Call<GetMovieResponse>
}
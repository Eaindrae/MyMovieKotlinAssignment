package com.padcmyanmar.padc9.mymoviekotlinassignment.network

import com.padcmyanmar.padc9.mymoviekotlinassignment.Constants.PARAM_ACCESS_TOKEN
import com.padcmyanmar.padc9.mymoviekotlinassignment.network.responses.GetMovieResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface MoviesApi {

    @POST
    @FormUrlEncoded
    fun getAllMovies(@Field(PARAM_ACCESS_TOKEN)accessToken:String):Call<GetMovieResponse>
}
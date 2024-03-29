package com.padcmyanmar.padc9.mymoviekotlinassignment.network.dataAgents

import com.padcmyanmar.padc9.mymoviekotlinassignment.utils.BASE_URL
import com.padcmyanmar.padc9.mymoviekotlinassignment.utils.EM_MOVIE_MODEL_NOT_INITIALIZED
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO
import com.padcmyanmar.padc9.mymoviekotlinassignment.network.MoviesApi
import com.padcmyanmar.padc9.mymoviekotlinassignment.network.responses.GetMovieResponse
import com.padcmyanmar.padc9.mymoviekotlinassignment.utils.EM_NULL_MOVIE_RESPONSE
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitDataAgent : MovieDataAgents {


    private val movieApi: MoviesApi

    init {

        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        movieApi = retrofit.create(MoviesApi::class.java)
    }

    override fun getMovies(onSuccess: (List<MovieVO>) -> Unit, onFailure: (String) -> Unit) {
        movieApi.getAllMovies().enqueue(object : Callback<GetMovieResponse> {
            override fun onFailure(call: Call<GetMovieResponse>, t: Throwable) {
                onFailure(t.localizedMessage)
            }

            override fun onResponse(call: Call<GetMovieResponse>, response: Response<GetMovieResponse>) {
                val response = response.body()
                if (response != null) {
                    if (response.data != null) {
                        onSuccess(response.data)
                    } else {
                        onFailure(response.message)
                    }
                } else {
                    onFailure(EM_NULL_MOVIE_RESPONSE)
                }
            }

        })
    }
}
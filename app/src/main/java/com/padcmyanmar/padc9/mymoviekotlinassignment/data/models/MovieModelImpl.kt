package com.padcmyanmar.padc9.mymoviekotlinassignment.data.models

import android.util.Log
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO

object MovieModelImpl: BaseModel(), MovieModel {

    override fun findMovieById(movieId: Int): MovieVO {
        return database.movieDao().getMoviesById(movieId)
    }

    override fun getAllMovies(onSuccess: (List<MovieVO>) -> Unit,
                              onFailure: (String) -> Unit) {

        val movieDataFromDB = database.movieDao().getMovies()
        if (movieDataFromDB.isNotEmpty()) {
            onSuccess(movieDataFromDB)
        }else{
            dataAgent.getMovies(

                onSuccess={
                    database.movieDao().insertMovies(it)
                    onSuccess(it)
                  //  Log.d("MovieModel",it.toString())
                },
                onFailure= {

                }
            )
        }
    }
}
package com.padcmyanmar.padc9.mymoviekotlinassignment.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.models.MovieModel
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.models.MovieModelImpl

abstract class BaseActivity: AppCompatActivity() {

    protected lateinit var movieModel: MovieModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        movieModel = MovieModelImpl
    }
}
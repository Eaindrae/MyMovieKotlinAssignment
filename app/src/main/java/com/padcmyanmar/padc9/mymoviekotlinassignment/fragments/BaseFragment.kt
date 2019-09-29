package com.padcmyanmar.padc9.mymoviekotlinassignment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.models.MovieModel
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.models.MovieModelImpl

abstract class BaseFragment: Fragment() {


    protected lateinit var movieModel: MovieModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        movieModel = MovieModelImpl
    }


}
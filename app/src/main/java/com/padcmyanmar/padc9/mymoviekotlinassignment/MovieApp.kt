package com.padcmyanmar.padc9.mymoviekotlinassignment

import android.app.Application
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.models.MovieModelImpl

class MovieApp: Application() {

    override fun onCreate() {
        super.onCreate()
        MovieModelImpl.initDatabase(applicationContext)
    }
}
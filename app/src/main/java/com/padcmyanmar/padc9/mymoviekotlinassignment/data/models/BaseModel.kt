package com.padcmyanmar.padc9.mymoviekotlinassignment.data.models

import android.content.Context
import com.padcmyanmar.padc9.mymoviekotlinassignment.network.dataAgents.MovieDataAgents
import com.padcmyanmar.padc9.mymoviekotlinassignment.network.dataAgents.RetrofitDataAgent
import com.padcmyanmar.padc9.mymoviekotlinassignment.persistence.MovieDB

open class BaseModel {

    protected val dataAgent= RetrofitDataAgent

    protected lateinit var database: MovieDB

    fun initDatabase(context: Context){
        database = MovieDB.getInstance(context)
    }
}
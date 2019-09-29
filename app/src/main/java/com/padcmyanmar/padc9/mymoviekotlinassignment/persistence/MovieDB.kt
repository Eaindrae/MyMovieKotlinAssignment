package com.padcmyanmar.padc9.mymoviekotlinassignment.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO
import com.padcmyanmar.padc9.mymoviekotlinassignment.persistence.daos.MovieDao
import com.padcmyanmar.padc9.mymoviekotlinassignment.persistence.typeconverters.GenreTypeConverter
import com.padcmyanmar.padc9.mymoviekotlinassignment.utils.DB_NAME

@Database(entities = arrayOf(MovieVO::class), version = 3, exportSchema = false)
@TypeConverters(GenreTypeConverter::class)
abstract class MovieDB: RoomDatabase() {

    abstract fun movieDao(): MovieDao

    companion object{
        var INSTANCE: MovieDB? = null

        fun getInstance(context: Context): MovieDB{
            if (INSTANCE == null){
                INSTANCE = Room.databaseBuilder(context, MovieDB::class.java, DB_NAME)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE!!
        }
    }

    fun areDatasExitInDB(): Boolean{
        return movieDao().getMovies().isNotEmpty()
    }
}
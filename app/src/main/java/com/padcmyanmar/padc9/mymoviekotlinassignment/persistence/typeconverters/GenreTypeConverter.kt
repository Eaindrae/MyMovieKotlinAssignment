package com.padcmyanmar.padc9.mymoviekotlinassignment.persistence.typeconverters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.GenreVO

class GenreTypeConverter {

    @TypeConverter
    fun toString(list: List<GenreVO>): String{
        return Gson().toJson(list)
    }

    @TypeConverter
    fun toList(json: String): List<GenreVO>{
        val typeToken = object: TypeToken<List<GenreVO>>(){}.type
        return Gson().fromJson(json, typeToken)
    }

}
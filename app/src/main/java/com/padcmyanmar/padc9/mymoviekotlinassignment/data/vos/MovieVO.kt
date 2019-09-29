package com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "movie")
data class MovieVO (
    @PrimaryKey
    @SerializedName("id")
    @ColumnInfo(name = "id")
    var id: Int,

    @SerializedName("movie_name")
    @ColumnInfo(name = "movie_name")
    var movie_name: String,

    @SerializedName("imdb")
    @ColumnInfo(name = "imdb")
    var imdb: Double,

    @SerializedName("rotten_tomato")
    @ColumnInfo(name = "rotten_tomato")
    var rotten_tomato: Int,

    @SerializedName("meta_centric")
    @ColumnInfo(name = "meta_centric")
    var meta_centric: Int,

    @SerializedName("genre")
    var genre: List<GenreVO>,

    @SerializedName("overview")
    @ColumnInfo(name = "overview")
    var overview: String,

    @SerializedName("poster")
    @ColumnInfo(name = "poster")
    var poster: String

)
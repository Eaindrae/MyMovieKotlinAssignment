package com.padcmyanmar.padc9.mymoviekotlinassignment.network.responses

import com.google.gson.annotations.SerializedName
import com.padcmyanmar.padc9.mymoviekotlinassignment.Constants.CODE_RESPONSE_OK
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO

data class GetMovieResponse(

    @SerializedName("code")
    val code: Int,
    @SerializedName("message")
    val message: String,
    @SerializedName("data")
    val data: List<MovieVO>?
) {
    fun isResponseOk(): Boolean {
        return code == CODE_RESPONSE_OK && data != null
    }
}
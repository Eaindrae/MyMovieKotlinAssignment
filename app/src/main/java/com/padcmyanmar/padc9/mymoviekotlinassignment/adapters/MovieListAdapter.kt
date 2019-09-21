package com.padcmyanmar.padc9.mymoviekotlinassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padc9.mymoviekotlinassignment.R
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO
import com.padcmyanmar.padc9.mymoviekotlinassignment.delegate.MovieItemDelegate
import com.padcmyanmar.padc9.mymoviekotlinassignment.viewholders.MovieItemViewHolder

class MovieListAdapter(private val delegate: MovieItemDelegate):BaseAdapter<MovieItemViewHolder,MovieVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieItemViewHolder {
val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_list_fragment_one,parent,false)
        return MovieItemViewHolder(view,delegate)
    }

}
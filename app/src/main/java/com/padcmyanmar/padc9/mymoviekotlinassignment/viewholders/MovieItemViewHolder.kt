package com.padcmyanmar.padc9.mymoviekotlinassignment.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO
import com.padcmyanmar.padc9.mymoviekotlinassignment.delegate.MovieItemDelegate
import kotlinx.android.synthetic.main.movie_list_fragment_one.view.*

class MovieItemViewHolder(itemView:View,private val delegate:MovieItemDelegate):BaseViewHolder<MovieVO>(itemView) {

    init {
        itemView.setOnClickListener {
            val id = data?.id
            if (id != null) {
                delegate.onTapMovieItem(id)
            }
        }
    }

    override fun bindData(data: MovieVO) {

        itemView.tv_movie_name.text = data.movieName
        itemView.tv_imdb_num.text = data.imdb.toString()
        itemView.tv_rotten_num.text = data.rottenTomato.toString()
        itemView.tv_meta_num.text = data.metaCentric.toString()

        Glide.with(itemView)
            .load(data.poster)
            .into(itemView.iv_movie_card)
    }
}
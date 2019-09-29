package com.padcmyanmar.padc9.mymoviekotlinassignment.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO
import com.padcmyanmar.padc9.mymoviekotlinassignment.delegate.MovieItemDelegate
import kotlinx.android.synthetic.main.now_showing_item_view.view.*

class NowShowingItemViewHolder(itemView:View, private val delegate:MovieItemDelegate):BaseViewHolder<MovieVO>(itemView) {

    init {
        itemView.setOnClickListener {
//            val id = data?.id
//            if (id != null) {
//                delegate.onTapMovieItem(id)
//            }

            data?.id?.let {id ->
                delegate.onTapMovieItem(id)
            }
        }
    }

    override fun bindData(data: MovieVO) {

        itemView.tv_movie_name.text = data.movie_name
        itemView.tv_imdb_num.text = data.imdb.toString()+ "%"
        itemView.tv_rotten_num.text = data.rotten_tomato.toString()+ "%"
        itemView.tv_meta_num.text = data.meta_centric.toString()+ "%"

        Glide.with(itemView)
            .load(data.poster)
            .into(itemView.iv_movie_card)
    }
}
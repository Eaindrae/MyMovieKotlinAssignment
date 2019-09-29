package com.padcmyanmar.padc9.mymoviekotlinassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.padcmyanmar.padc9.mymoviekotlinassignment.R
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO
import com.padcmyanmar.padc9.mymoviekotlinassignment.delegate.MovieItemDelegate
import com.padcmyanmar.padc9.mymoviekotlinassignment.viewholders.NowShowingItemViewHolder

class NowShowingAdapter(private val delegate: MovieItemDelegate):BaseAdapter<NowShowingItemViewHolder,MovieVO>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NowShowingItemViewHolder {
val view = LayoutInflater.from(parent.context).inflate(R.layout.now_showing_item_view,parent,false)
        return NowShowingItemViewHolder(view,delegate)
    }

}
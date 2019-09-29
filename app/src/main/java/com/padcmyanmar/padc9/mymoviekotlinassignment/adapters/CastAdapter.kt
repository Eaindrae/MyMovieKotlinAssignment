package com.padcmyanmar.padc9.mymoviekotlinassignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padc9.mymoviekotlinassignment.R
import com.padcmyanmar.padc9.mymoviekotlinassignment.viewholders.CastItemViewHolder

class CastAdapter: RecyclerView.Adapter<CastItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CastItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cast_item_view, parent, false)
        return CastItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: CastItemViewHolder, position: Int) {

    }
}
package com.padcmyanmar.padc9.mymoviekotlinassignment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padc9.mymoviekotlinassignment.R
import com.padcmyanmar.padc9.mymoviekotlinassignment.activities.MovieDetailListActivity
import com.padcmyanmar.padc9.mymoviekotlinassignment.adapters.NowShowingAdapter
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO
import com.padcmyanmar.padc9.mymoviekotlinassignment.delegate.MovieItemDelegate
import kotlinx.android.synthetic.main.fragment_now_showing.*

class NowShowingFragment : BaseFragment(), MovieItemDelegate {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_now_showing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nowShowingAdapter = NowShowingAdapter(this)
LinearSnapHelper().attachToRecyclerView(rv_now_showing)

        val layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        rv_now_showing.layoutManager = layoutManager
        rv_now_showing.adapter = nowShowingAdapter

        movieModel.getAllMovies(
            onSuccess = {moviesVO ->
                nowShowingAdapter.setNewData(moviesVO as MutableList<MovieVO>)

            },
            onFailure = {

            }
        )
    }
    override fun onTapMovieItem(movieId: Int) {
        startActivity(MovieDetailListActivity.newIntent(context!!, movieId))
    }



    /*override fun onAttach(context: Context) {
        super.onAttach(context)
        fragmentDelegate = context as FragmentDelegate
    }*/
}

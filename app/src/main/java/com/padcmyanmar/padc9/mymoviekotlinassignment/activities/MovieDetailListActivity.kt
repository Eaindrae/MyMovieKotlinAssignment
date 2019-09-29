package com.padcmyanmar.padc9.mymoviekotlinassignment.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.padcmyanmar.padc9.mymoviekotlinassignment.R
import com.padcmyanmar.padc9.mymoviekotlinassignment.adapters.CastAdapter
import com.padcmyanmar.padc9.mymoviekotlinassignment.adapters.ScreenshotsAdapter
import com.padcmyanmar.padc9.mymoviekotlinassignment.data.vos.MovieVO
import kotlinx.android.synthetic.main.activity_detail1.*


class MovieDetailListActivity:BaseActivity() {


    private lateinit var castAdapter: CastAdapter
    private lateinit var screenshotsAdapter: ScreenshotsAdapter


    companion object{
       const val EXTRA_MOVIE_ID = "movieExtra"
        fun newIntent(context: Context, movieIdExtra: Int): Intent {
         return Intent(context, MovieDetailListActivity::class.java).apply {
                putExtra(EXTRA_MOVIE_ID,movieIdExtra)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail1)

        val linearLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rv_cast.layoutManager = linearLayoutManager

        castAdapter = CastAdapter()
        rv_cast.adapter = castAdapter


        val ss_linearLayoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rv_screenshots.layoutManager = ss_linearLayoutManager

        screenshotsAdapter = ScreenshotsAdapter()
        rv_screenshots.adapter = screenshotsAdapter





        iv_close.setOnClickListener {
            finish()
        }

        val id = intent.getIntExtra(EXTRA_MOVIE_ID, 0)
        Log.d("Model",id.toString())
        if (id != 0){
            val movieVO = movieModel.findMovieById(id)
          bindData(movieVO)

        }

    }

 fun bindData(movieVo:MovieVO){

    tv_movie_detail_title.text = movieVo.movie_name
    tv_imdb_num.text = movieVo.imdb.toString() + "%"
    tv_meta_num.text = movieVo.meta_centric.toString() + "%"
    tv_rotten_num.text = movieVo.rotten_tomato.toString() + "%"
    tv_description.text = movieVo.overview

    Glide.with(this)
        .load(movieVo.poster)
        .into(iv_background)

     Glide.with(this)
         .load(movieVo.poster)
         .into(iv_background1)

}


}
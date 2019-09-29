package com.padcmyanmar.padc9.mymoviekotlinassignment.activities


import android.os.Bundle

import com.padcmyanmar.padc9.mymoviekotlinassignment.R
import com.padcmyanmar.padc9.mymoviekotlinassignment.adapters.TapPagerAdapter

import com.padcmyanmar.padc9.mymoviekotlinassignment.delegate.MovieItemDelegate

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tabPagerAdapter = TapPagerAdapter(supportFragmentManager)
        viewpager.adapter = tabPagerAdapter
        tablayout.setupWithViewPager(viewpager)

        //val eventId = intent.getIntExtra(EXTRA_MOVIE_ID, 0)


    }
    //,MovieItemDelegate
//    override fun onTapMovieItem(eventId: Int) {
//      startActivity(MovieDetailListActivity.newIntent(applicationContext, eventId))
//    }


}

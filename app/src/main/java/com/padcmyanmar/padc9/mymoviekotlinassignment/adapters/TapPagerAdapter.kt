package com.padcmyanmar.padc9.mymoviekotlinassignment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.padcmyanmar.padc9.mymoviekotlinassignment.fragments.CinemaFragment
import com.padcmyanmar.padc9.mymoviekotlinassignment.fragments.ComingSoonFragment
import com.padcmyanmar.padc9.mymoviekotlinassignment.fragments.NowShowingFragment


class TapPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> NowShowingFragment()
            1 -> CinemaFragment()
            else -> ComingSoonFragment()
        }
    }

    override fun getCount(): Int {
        return 3
    }


    override fun getPageTitle(position: Int): CharSequence {
        return when (position){
            0 -> "Now Showing"
            1 -> "Cinema"
            else -> "Coming Soon"
        }
    }


}
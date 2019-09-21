package com.padcmyanmar.padc9.mymoviekotlinassignment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.padcmyanmar.padc9.mymoviekotlinassignment.fragments.FragmentOne

class TapPagerAdapter(fm:FragmentManager):FragmentStatePagerAdapter(fm,Int) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return FragmentOne()

        } else if (position == 1) {
            return FragmentOne()
        }
    }
         override fun getPageTitle(position: Int): CharSequence {
            return if (position == 0) {
                "Now Showing"
            } else if (position == 1) {
                "Cinema"
            } else
                "Coming Soon"
        }


}
package com.padcmyanmar.padc9.mymoviekotlinassignment.fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.padcmyanmar.padc9.mymoviekotlinassignment.R
import com.padcmyanmar.padc9.mymoviekotlinassignment.activities.MovieDetailListActivity
import com.padcmyanmar.padc9.mymoviekotlinassignment.adapters.MovieListAdapter
import com.padcmyanmar.padc9.mymoviekotlinassignment.delegate.MovieItemDelegate
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FragmentOne.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FragmentOne.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class FragmentOne : Fragment(),MovieItemDelegate {
    companion object {

        @JvmStatic
        fun newInstance() =
            FragmentOne().apply {
                arguments = Bundle().apply {

                }
                //
                return FragmentOne()
            }
    }
    override fun onTapMovieItem(eventId: Int) {
//startActivity(new Intent(this.context,MovieDetailListActivity()))
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvMovies.setHasFixedSize(true)
        rvMovies.layoutManager = LinearLayoutManager(context)
        rvMovies.adapter=MovieListAdapter(this)

    }


}

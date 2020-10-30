package io.tigranes.room_database_example

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class HomeFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        homeViewModel = viewModelFactory.create(HomeViewModel::class.java)
        Log.d("abrakadabra", "onCreateView: ${homeViewModel.getName}")
        return view
    }

    companion object {

        @JvmStatic
        fun newInstance() = HomeFragment()

    }
}
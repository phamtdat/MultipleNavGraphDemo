package com.example.multiplenavgraphdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_common.view.*

class ListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_common, container, false)
        view?.tv_fragment_name?.let { tv ->
            tv.text = "ListFragment"
            tv.setOnClickListener {
                findNavController().navigate(ListFragmentDirections.listToMovie())
            }
        }
        return view
    }
}
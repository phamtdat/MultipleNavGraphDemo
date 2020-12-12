package com.example.multiplenavgraphdemo

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_common.view.*

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_common, container, false)
        view?.tv_fragment_name?.let { tv ->
            tv.text = "MainFragment"
            tv.setOnClickListener {
                findNavController().navigate(MainFragmentDirections.toList())
            }
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        // as startDestination, extract the args from container activity
        activity?.intent?.extras?.let { safeExtras ->
            val args = MainFragmentArgs.fromBundle(safeExtras)
            Log.d("AAAA", "userId = ${args.userId}")
            Toast.makeText(activity, "userId = ${args.userId}", Toast.LENGTH_SHORT).show()
        }
    }
}
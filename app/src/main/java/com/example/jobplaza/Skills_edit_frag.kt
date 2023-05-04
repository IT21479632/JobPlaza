package com.example.jobplaza

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class Skills_edit_frag : Fragment() {

    var output2 : String ?= ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_skills_edit_frag, container, false)

        val textview2 : TextView = view.findViewById(R.id.we_are_seeking222)

        output2 = arguments?.getString("we_are_seeking222")
        textview2.text = output2

        return view
    }

}
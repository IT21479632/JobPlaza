package com.example.jobplaza

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class Experience_edit_frag : Fragment() {

    var output3 : String ?= ""


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_experience_edit_frag, container, false)
        val textview3 : TextView = view.findViewById(R.id.we_are_seeking22)

        output3 = arguments?.getString("we_are_seeking22")
        textview3.text = output3

        return view

    }


}
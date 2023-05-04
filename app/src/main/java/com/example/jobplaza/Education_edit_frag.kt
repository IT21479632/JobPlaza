package com.example.jobplaza

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class Education_edit_frag : Fragment() {

    var output1 : String ?= ""



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_education_edit_frag, container, false)

        val textview : TextView = view.findViewById(R.id.we_are_seeking2)


        output1 = arguments?.getString("we_are_seeking2")
        textview.text = output1




        return view
    }


}
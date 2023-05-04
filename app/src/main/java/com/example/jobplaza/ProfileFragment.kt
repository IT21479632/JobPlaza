package com.example.jobplaza

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.jobplaza.databinding.FragmentHomeBinding
import com.example.jobplaza.databinding.FragmentProfileBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private lateinit var database : DatabaseReference


    private lateinit var communicator: communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val btn1  : Button = view.findViewById(R.id.add_ek1)
        val btn2  : Button = view.findViewById(R.id.add_ek2)
        val btn3  : Button = view.findViewById(R.id.add_ek3)


        val textview1 : TextView = view.findViewById(R.id.experiencetextbox)
        val textview2 : TextView = view.findViewById(R.id.skilltext)
        val textview3 : TextView = view.findViewById(R.id.educationtext)


        communicator = activity as communicator

        btn1.setOnClickListener {
            communicator.passData1(textview1.text.toString())
        }
        btn2.setOnClickListener {
            communicator.passData2(textview2.text.toString())
        }
        btn3.setOnClickListener {
            communicator.passData3(textview3.text.toString())
        }




        return view

    }



}
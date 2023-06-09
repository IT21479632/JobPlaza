package com.example.jobplaza

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jobplaza.databinding.FragmentHomeBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class HomeFragment : Fragment() {
//--------
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
//--------

    private lateinit var database : DatabaseReference


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //-----
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        //-----

        binding.testsubmitbutton.setOnClickListener{

            val name = binding.editTextText.text.toString()
            val exp = binding.editTextText2.text.toString()
            val ski = binding.editTextText3.text.toString()
            val edu = binding.editTextText4.text.toString()

            database = FirebaseDatabase.getInstance().getReference("UserproD")

            val userprod = UserproD(name,exp,ski,edu)
            database.child(name).setValue(userprod).addOnSuccessListener {

                binding.editTextText.text.clear()
                binding.editTextText2.text.clear()
                binding.editTextText3.text.clear()
                binding.editTextText4.text.clear()

                //Toast.makeText(this,"dsd",20).show()

            }.addOnFailureListener {

                //Toast.makeText(this,"failed",Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root

    }


}
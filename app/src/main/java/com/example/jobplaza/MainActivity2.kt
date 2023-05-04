package com.example.jobplaza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.jobplaza.databinding.ActivityMain2Binding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding : ActivityMain2Binding
    private lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.testsubmitbutton.setOnClickListener{

            val userproname = binding.editTextText1.text.toString()
            val exp = binding.editTextText2.text.toString()
            val ski = binding.editTextText3.text.toString()
            val edu = binding.editTextText4.text.toString()

            database = FirebaseDatabase.getInstance().getReference("UserproD")

            val UserproD = UserproD(userproname,exp,ski,edu)

            database.child(userproname).setValue(UserproD).addOnSuccessListener {

                binding.editTextText1.text.clear()
                binding.editTextText2.text.clear()
                binding.editTextText3.text.clear()
                binding.editTextText4.text.clear()

                Toast.makeText(this,"successfull",Toast.LENGTH_SHORT).show()

            }.addOnFailureListener {

                Toast.makeText(this,"failed",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
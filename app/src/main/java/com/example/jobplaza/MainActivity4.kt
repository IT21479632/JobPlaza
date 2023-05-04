package com.example.jobplaza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.jobplaza.databinding.ActivityMain4Binding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding
    private lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.updateBtn.setOnClickListener {

            val userName = binding.userName.text.toString()
            val exp = binding.firstName.text.toString()
            val skil = binding.lastname.text.toString()
            val edu = binding.age.text.toString()

            updateData(userName,exp,skil,edu)

        }
    }
    private fun updateData(userName: String, exp: String, skil: String, edu: String) {

        database = FirebaseDatabase.getInstance().getReference("UserproD")
        val userproD = mapOf<String,String>(
            "experience" to exp,
            "skills" to skil,
            "eduction" to edu
        )

        database.child(userName).updateChildren(userproD).addOnSuccessListener {

            binding.userName.text.clear()
            binding.firstName.text.clear()
            binding.lastname.text.clear()
            binding.age.text.clear()
            Toast.makeText(this,"Successfuly Updated",Toast.LENGTH_SHORT).show()


        }.addOnFailureListener{

            Toast.makeText(this,"Failed to Update",Toast.LENGTH_SHORT).show()

        }}

}
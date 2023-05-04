package com.example.jobplaza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.jobplaza.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference

class MainActivity : AppCompatActivity(),communicator {

    private lateinit var binding : ActivityMainBinding
    private lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.jobs -> replaceFragment(JobFragment())
                R.id.favourites -> replaceFragment(FavouritesFragment())
                R.id.profile -> replaceFragment(ProfileFragment())

                else -> {}
            }
            true
        }



    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }



    override fun passData1(editTextData: String) {
        val bundle = Bundle()
        bundle.putString("we_are_seeking22",editTextData)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentb = Experience_edit_frag()

        fragmentb.arguments = bundle
        transaction.replace(R.id.frame_layout,fragmentb).commit()
    }

    override fun passData2(editTextData: String) {
        val bundle = Bundle()
        bundle.putString("we_are_seeking222",editTextData)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentc = Skills_edit_frag()

        fragmentc.arguments = bundle
        transaction.replace(R.id.frame_layout,fragmentc).commit()
    }

    override fun passData3(editTextData: String) {
        val bundle = Bundle()
        bundle.putString("we_are_seeking2",editTextData)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentd = Education_edit_frag()

        fragmentd.arguments = bundle
        transaction.replace(R.id.frame_layout,fragmentd).commit()
    }
}
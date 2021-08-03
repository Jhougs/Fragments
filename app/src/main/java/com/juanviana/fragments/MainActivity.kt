package com.juanviana.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.juanviana.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  // private lateinit var mainbinding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //mainbinding = ActivityMainBinding.inflate(layoutInflater)

    }
}
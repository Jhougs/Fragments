package com.juanviana.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juanviana.fragments.databinding.FragmentWonderWomanBinding
private lateinit var wonderWomanBinding: FragmentWonderWomanBinding
class WonderWomanFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        wonderWomanBinding = FragmentWonderWomanBinding.inflate(inflater,container,false)
       return  wonderWomanBinding.root
    }


}
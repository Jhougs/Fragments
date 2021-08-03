package com.juanviana.otherexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juanviana.otherexample.databinding.FragmentSupermanBinding


private  lateinit var supermanBinding: FragmentSupermanBinding
class SupermanFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      supermanBinding= FragmentSupermanBinding.inflate(inflater,container,false)
        return  supermanBinding.root
    }


}
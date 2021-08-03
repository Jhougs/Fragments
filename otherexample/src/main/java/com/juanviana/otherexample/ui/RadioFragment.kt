package com.juanviana.otherexample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.juanviana.otherexample.databinding.FragmentAreacirculoBinding


class RadioFragment : Fragment() {
    private lateinit var radioBinding: FragmentAreacirculoBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        radioBinding= FragmentAreacirculoBinding.inflate(inflater,container,false)

       radioBinding.calcuarButton.setOnClickListener {
           val radio= radioBinding.edRadiocm.text.toString()
           val pi: Double = 3.1416
           calcularArea(radio,pi)



       }
               return radioBinding.root


    }

    private fun calcularArea(radio: String,pi: Double) {
       val area= radio.toDouble()*pi
        radioBinding.textView2.text= ("El radio de su circulo es de:" + area + "cm" )

    }


}
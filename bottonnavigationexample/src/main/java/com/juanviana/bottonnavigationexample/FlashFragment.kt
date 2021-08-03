package com.juanviana.bottonnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.juanviana.bottonnavigationexample.databinding.FragmentFlashBinding


private lateinit var flashBinding: FragmentFlashBinding
class FlashFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
       flashBinding= FragmentFlashBinding.inflate(inflater,container,false)
        return flashBinding.root
    }


}
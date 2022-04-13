package com.android.fragmentspractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.android.fragmentspractice.R
import com.android.fragmentspractice.databinding.FragmentFourBinding

class FragmentFour : Fragment() {
   lateinit var binding: FragmentFourBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=DataBindingUtil.inflate(inflater,R.layout.fragment_four,container,false)
        return binding.root
    }



}
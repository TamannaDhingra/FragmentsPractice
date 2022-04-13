package com.android.fragmentspractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.fragmentspractice.R
import com.android.fragmentspractice.base.BaseActivity
import com.android.fragmentspractice.databinding.FragmentTwoBinding

class FragmentTwo : Fragment(), CounterVariable {
   lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment

        binding= FragmentTwoBinding.inflate(inflater,container,false)


       // BaseActivity().replaceFragment(FragmentThree(),true)
        (activity as BaseActivity).counterCallBack = this


        return binding.root

    }

    override fun countItems(count: Int) {
        binding.showCount.text=count.toString()
    }

}
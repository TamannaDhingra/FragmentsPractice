package com.android.fragmentspractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.fragmentspractice.MainActivity
import com.android.fragmentspractice.base.BaseActivity
import com.android.fragmentspractice.databinding.FragmentOneBinding

class FragmentOne : Fragment() {
    lateinit var binding: FragmentOneBinding
    lateinit var co:CounterVariable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentOneBinding.inflate(inflater,container,false)

      //  BaseActivity().replaceFragment2(FragmentTwo(),true)
        var count=1
        binding.clickBtn.setOnClickListener {
           (activity as MainActivity).counterCallBack.countItems(count++)

        }

        return binding.root




    }



}
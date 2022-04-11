package com.android.fragmentspractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.fragmentspractice.MainActivity
import com.android.fragmentspractice.R
import com.android.fragmentspractice.base.BaseActivity
import com.android.fragmentspractice.databinding.FragmentThreeBinding
import java.text.FieldPosition

class FragmentThree : Fragment() {

    lateinit var binding: FragmentThreeBinding

    lateinit var recyclerAdapter:Fragment3Adapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding= FragmentThreeBinding.inflate(inflater,container,false)

      //  (activity as BaseActivity).initalizeList()


         recyclerAdapter = Fragment3Adapter(this,(activity as MainActivity).list)
        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        binding.rv.adapter = recyclerAdapter


        return binding.root



        return binding.root
    }
 fun setCheckbox(position: Int, b: Boolean) {
     (activity as BaseActivity).list.get(position).isChecked=b
     recyclerAdapter.notifyDataSetChanged()

 }


}

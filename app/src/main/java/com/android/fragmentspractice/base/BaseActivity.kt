package com.android.fragmentspractice.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.android.fragmentspractice.R
import com.android.fragmentspractice.fragments.CounterVariable
import com.android.fragmentspractice.fragments.NamesModel

open class BaseActivity : AppCompatActivity() {

    var currentFragment : Fragment?= null
    var fragmentTransaction : FragmentTransaction?= null
    lateinit var counterCallBack:CounterVariable
    var list:ArrayList<NamesModel> = ArrayList()

    fun replaceFragment(mFragment: Fragment, isBack: Boolean){
        currentFragment = mFragment
        fragmentTransaction = supportFragmentManager.beginTransaction()

        if (isBack)
        {
            fragmentTransaction!!.addToBackStack(mFragment::class.java.simpleName)
        }

        fragmentTransaction?.replace(R.id.mainContainer,currentFragment!!, mFragment::class.java.simpleName)?.commit()
    }

    fun replaceFragment2(mFragment: Fragment, isBack: Boolean){
        currentFragment = mFragment
        fragmentTransaction = supportFragmentManager.beginTransaction()

        if (isBack)
        {
            fragmentTransaction!!.addToBackStack(mFragment::class.java.simpleName)
        }

        fragmentTransaction?.replace(R.id.mainContainer2,currentFragment!!, mFragment::class.java.simpleName)?.commit()
    }


    fun initalizeList(){

        list.add(NamesModel("Tamanna",false))
        list.add(NamesModel("Sakshi",false))
        list.add(NamesModel("Komal",false))
        list.add(NamesModel("Aaru",false))
        list.add(NamesModel("Sonu",false))
        list.add(NamesModel("Sandeep",false))
        list.add(NamesModel("Shifali",false))
        list.add(NamesModel("Saanvi",false))
        list.add(NamesModel("Sherrin",false))
        list.add(NamesModel("Hello",false))
        list.add(NamesModel("Kajal",false))
        list.add(NamesModel("Kiran",false))
        list.add(NamesModel("Sherry",false))
        list.add(NamesModel("Sonia",false))
        list.add(NamesModel("Billu",false))
        list.add(NamesModel("Golu",false))


    }


}
package com.android.fragmentspractice.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.android.fragmentspractice.R
import com.android.fragmentspractice.fragments.CounterVariable

open class BaseActivity : AppCompatActivity() {

    var currentFragment : Fragment?= null
    var fragmentTransaction : FragmentTransaction?= null
    lateinit var counterCallBack:CounterVariable


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



}
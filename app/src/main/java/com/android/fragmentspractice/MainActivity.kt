package com.android.fragmentspractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.android.fragmentspractice.base.BaseActivity
import com.android.fragmentspractice.databinding.ActivityMainBinding
import com.android.fragmentspractice.fragments.FragmentFour
import com.android.fragmentspractice.fragments.FragmentOne
import com.android.fragmentspractice.fragments.FragmentThree
import com.android.fragmentspractice.fragments.FragmentTwo

class MainActivity : BaseActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initalizeList()
        replaceFragment(FragmentOne(),true)
       // replaceFragment2(FragmentTwo(),true)

        bottomNavigationCode()

    }

    /** Returns the current Visible fragment on Container */
    private fun getVisibleFragment(): Fragment {
        return supportFragmentManager.findFragmentById(R.id.mainContainer)!!
    }

    private fun bottomNavigationCode() {

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.homeMenu ->{
                    replaceFragment(FragmentOne(), true)
                    true
                }
                R.id.myorderMenu ->{
                    replaceFragment(FragmentTwo(), true)
                    true
                }
                R.id.mycartMenu -> {
                    replaceFragment(FragmentThree(), true)
                    true
                }
                R.id.settingsMenu ->{
                    replaceFragment(FragmentFour(), true)
                    true
                }
                else -> false
            }
        }
    }


    override fun onBackPressed() {
        super.onBackPressed()
        val localFragmentManager = supportFragmentManager
        val i = localFragmentManager.backStackEntryCount

        if (getVisibleFragment() is FragmentOne) {
           // dialogExitApp()
            return
        }
        if (getVisibleFragment() is FragmentOne ){
            finish()
        } else if (getVisibleFragment() is FragmentTwo|| getVisibleFragment() is FragmentThree||getVisibleFragment() is FragmentFour){
            binding.bottomNavigationView.selectedItemId = R.id.homeMenu

        } else {
            localFragmentManager.popBackStack()
        }
    }

}
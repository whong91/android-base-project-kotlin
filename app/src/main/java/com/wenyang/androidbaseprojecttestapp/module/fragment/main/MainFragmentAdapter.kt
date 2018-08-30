package com.wenyang.androidbaseprojecttestapp.module.fragment.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.wenyang.androidbaseprojectmodule.base.adapter.FragmentAdapter
import com.wenyang.androidbaseprojectmodule.dagger.module.BaseFragmentModule
import com.wenyang.androidbaseprojectmodule.dagger.scope.PerFragment
import com.wenyang.androidbaseprojecttestapp.module.child_fragment.first.FirstChildFragment
import com.wenyang.androidbaseprojecttestapp.module.child_fragment.second.SecondChildFragment
import javax.inject.Inject
import javax.inject.Named

@PerFragment
class MainFragmentAdapter @Inject constructor(@Named(BaseFragmentModule.CHILD_FRAGMENT_MANAGER) fragmentManager: FragmentManager)
    : FragmentAdapter(fragmentManager){

    override fun getItem(position: Int): Fragment {

        val fragment = super.getItem(position)

        if(fragment is FirstChildFragment){

            fragment.string = "12312312312"
        }

        if(fragment is SecondChildFragment){

            fragment.string = "22222222222"
        }

        return fragment
    }

}
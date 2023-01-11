package com.waihong.androidbaseprojecttestapp.module.fragment.main

import android.os.Bundle
import com.waihong.androidbaseprojectmodule.base.fragment.BaseFragmentPresenter
import com.waihong.androidbaseprojectmodule.dagger.scope.PerFragment
import com.waihong.androidbaseprojecttestapp.module.child_fragment.first.FirstChildFragment
import com.waihong.androidbaseprojecttestapp.module.child_fragment.second.SecondChildFragment
import javax.inject.Inject

@PerFragment
class MainFragmentPresenter @Inject constructor(view: MainFragmentView) : BaseFragmentPresenter<MainFragmentView>(view){


    override fun onStart(savedInstanceState: Bundle?) {
        super.onStart(savedInstanceState)

        view.setupTabViewPager()

        view.momentViewPagerAdapter.addFragment(FirstChildFragment(),"hey")
        view.momentViewPagerAdapter.addFragment(SecondChildFragment(),"yo")
        view.momentViewPagerAdapter.addFragment(FirstChildFragment(),"hey")
        view.momentViewPagerAdapter.addFragment(SecondChildFragment(),"yo")
        view.momentViewPagerAdapter.addFragment(FirstChildFragment(),"hey")
        view.momentViewPagerAdapter.addFragment(SecondChildFragment(),"yo")
        view.momentViewPagerAdapter.addFragment(FirstChildFragment(),"hey")
        view.momentViewPagerAdapter.addFragment(SecondChildFragment(),"yo")

    }
}
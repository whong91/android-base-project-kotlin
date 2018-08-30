package com.wenyang.androidbaseprojecttestapp.module.fragment.main

import android.os.Bundle
import com.wenyang.androidbaseprojectmodule.base.fragment.BaseFragmentPresenter
import com.wenyang.androidbaseprojectmodule.dagger.scope.PerFragment
import com.wenyang.androidbaseprojecttestapp.module.child_fragment.first.FirstChildFragment
import com.wenyang.androidbaseprojecttestapp.module.child_fragment.second.SecondChildFragment
import javax.inject.Inject

@PerFragment
class MainFragmentPresenter @Inject constructor(view: MainFragmentView) : BaseFragmentPresenter<MainFragmentView>(view){


    override fun onStart(savedInstanceState: Bundle?) {
        super.onStart(savedInstanceState)

        view.setupTabViewPager()

        view.mainFragmentAdapter.addFragment(FirstChildFragment(),"hey")
        view.mainFragmentAdapter.addFragment(SecondChildFragment(),"yo")
//        override fun setupTabViewPager() {
//            viewpager_moment.adapter = momentViewPagerAdapter
//
//            tablayout_moment.setupWithViewPager(viewpager_moment)
//        }
//
//        override fun addToMomentViewPagerAdapter(aggregateViewModel: AggregateViewModel, callback: MomentFragmentCallback?) {
//            momentViewPagerAdapter.addChildFragment(aggregateViewModel, callback)
//            momentViewPagerAdapter.notifyDataSetChanged()
//        }
    }
}
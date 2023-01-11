package com.waihong.androidbaseprojecttestapp.module.fragment.main

import com.waihong.androidbaseprojectmodule.base.fragment.BaseFragmentView

interface MainFragmentView : BaseFragmentView{


    val mainFragmentAdapter : MainFragmentAdapter
    val momentViewPagerAdapter : MomentViewPagerAdapter


    fun setupTabViewPager()
}
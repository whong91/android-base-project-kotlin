package com.wenyang.androidbaseprojecttestapp.module.fragment.main

import com.wenyang.androidbaseprojectmodule.base.fragment.BaseFragmentView

interface MainFragmentView : BaseFragmentView{


    val mainFragmentAdapter : MainFragmentAdapter


    fun setupTabViewPager()
}
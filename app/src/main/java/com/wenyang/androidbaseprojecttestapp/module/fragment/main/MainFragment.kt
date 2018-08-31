package com.wenyang.androidbaseprojecttestapp.module.fragment.main


import android.support.v4.app.Fragment
import com.wenyang.androidbaseprojectmodule.base.fragment.BaseFragment
import com.wenyang.androidbaseprojecttestapp.R
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : BaseFragment<MainFragmentView, MainFragmentPresenter>(), MainFragmentView {
    @Inject
    override lateinit var momentViewPagerAdapter: MomentViewPagerAdapter


    override fun setupTabViewPager() {
        viewpager_mainfragment.adapter = momentViewPagerAdapter

        tablayout_mainfragment.setupWithViewPager(viewpager_mainfragment)
    }

    @Inject
    override lateinit var mainFragmentAdapter: MainFragmentAdapter


    override fun getLayoutId(): Int = R.layout.fragment_main


}

package com.wenyang.androidbaseprojectmodule.base.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.PagerAdapter
import android.util.Log

abstract class FragmentAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    val fragmentArrayList = ArrayList<Fragment>()

    val fragmentTitleArrayList = ArrayList<String>()

    override fun getCount(): Int = fragmentArrayList.size

    override fun getItem(position: Int): Fragment = fragmentArrayList[position]

    override fun getPageTitle(position: Int): CharSequence? = fragmentTitleArrayList[position]

    fun addFragment(fragment: Fragment, title: String) {
        fragmentArrayList.add(fragment)
        fragmentTitleArrayList.add(title)

        notifyDataSetChanged()
    }

    fun removeFragmentAtPosition(position: Int) {

        val fragment = fragmentArrayList[position]
        val title = fragmentTitleArrayList[position]

        fragmentArrayList.remove(fragment)
        fragmentTitleArrayList.remove(title)

        notifyDataSetChanged()
    }
}

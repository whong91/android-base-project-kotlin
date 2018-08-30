package com.wenyang.androidbaseprojectmodule.base.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.PagerAdapter

abstract class FragmentAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    val fragmentArrayList = ArrayList<Fragment>()

    val fragmentTitleArrayList = ArrayList<String>()

    override fun getCount(): Int = fragmentArrayList.size

    override fun getItem(position: Int): Fragment {
//        val fragment = MomentChildFragment()
//
//        fragment.callback = callback
//
//        val childViewModel = mPagerItem[position].childViewModel
//
//        fragment.onReady(aggregateViewModel, childViewModel)
        return fragmentArrayList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? = fragmentTitleArrayList[position]

    override fun getItemPosition(`object`: Any): Int = PagerAdapter.POSITION_NONE

    fun addFragment(fragment: Fragment, title: String) {
        fragmentArrayList.add(fragment)
        fragmentTitleArrayList.add(title)

        notifyDataSetChanged()
    }

    fun removeFragmentAtPosition(position: Int){

        val fragment =  fragmentArrayList[position]
        val title = fragmentTitleArrayList[position]

        fragmentArrayList.remove(fragment)
        fragmentTitleArrayList.remove(title)

        notifyDataSetChanged()
    }

//    override fun getPageTitle(position: Int): CharSequence {
//        return mPagerItem[position].childViewModel.cleanName().toString()
//    }

//    override fun getItemPosition(item: Any?): Int {
//        val fragment = item as MomentChildFragment?
//
//        val position = mPagerItem.indexOfFirst { it.momentChildFragment == fragment }
//
//        return if (position >= 0) {
//            position
//        } else {
//            PagerAdapter.POSITION_NONE
//        }
//    }
//
//    fun addChildFragment(aggregateViewModel: AggregateViewModel, callback: MomentFragmentCallback?) {
//
//        this.callback = callback
//
//        val childViewModelList = aggregateViewModel.childViewModelList
//
//        this.aggregateViewModel = aggregateViewModel
//
//        mPagerItem.clear()
//
//        val homeChildResponse = ChildResponse(id = Constant.HOME_ID, name = "HOME")
//        val addChildResponse = ChildResponse(id = Constant.ADD_ID, name = "ADD")
//
//        val homeChildViewModel = ChildViewModel(homeChildResponse)
//        val addChildViewModel = ChildViewModel(addChildResponse)
//
//        val addedChildResponseIdList = mPagerItem.mapNotNull { it.childViewModel.childResponse.id }
//
////        if(!addedChildResponseIdList.contains(homeChildResponse.id)){
//
//        val pagerItem = MomentPagerItem(homeChildViewModel, MomentChildFragment())
//
//        mPagerItem.add(pagerItem)
////        }
//
//        childViewModelList.forEach {
//
//            val currentChildViewModel = it
//
////            val existingPagerItem = mPagerItem.firstOrNull { it.childViewModel.childResponse.id == currentChildViewModel.childResponse.id}
//
////            if(existingPagerItem == null){
//
//            val newPagerItem = MomentPagerItem(childViewModel = it, momentChildFragment = MomentChildFragment())
//
//            mPagerItem.add(newPagerItem)
//
//        }
//
//
//        if (!addedChildResponseIdList.contains(addChildResponse.id)) {
//
//            val latestPagerItem = MomentPagerItem(addChildViewModel, MomentChildFragment())
//
//            mPagerItem.add(latestPagerItem)
//        }
//
//        notifyDataSetChanged()
//
//    }
}

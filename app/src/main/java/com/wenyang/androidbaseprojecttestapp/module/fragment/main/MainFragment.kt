package com.wenyang.androidbaseprojecttestapp.module.fragment.main


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wenyang.androidbaseprojectmodule.base.fragment.BaseFragment

import com.wenyang.androidbaseprojecttestapp.R

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : BaseFragment<MainFragmentView,MainFragmentPresenter>(), MainFragmentView{
    override fun getLayoutId(): Int = R.layout.fragment_main


}

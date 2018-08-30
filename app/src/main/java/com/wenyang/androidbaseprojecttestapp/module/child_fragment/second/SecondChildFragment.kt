package com.wenyang.androidbaseprojecttestapp.module.child_fragment.second


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wenyang.androidbaseprojectmodule.base.fragment.BaseFragment

import com.wenyang.androidbaseprojecttestapp.R

class SecondChildFragment : BaseFragment<SecondChildFragmentView, SecondChildFragmentPresenter>(), SecondChildFragmentView{
    override var string: String = ""

    override fun getLayoutId(): Int = R.layout.fragment_second_child




}

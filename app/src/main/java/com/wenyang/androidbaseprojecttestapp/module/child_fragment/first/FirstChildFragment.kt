package com.wenyang.androidbaseprojecttestapp.module.child_fragment.first


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wenyang.androidbaseprojectmodule.base.fragment.BaseFragment

import com.wenyang.androidbaseprojecttestapp.R

class FirstChildFragment : BaseFragment<FirstChildFragmentView, FirstChildFragmentPresenter>(), FirstChildFragmentView {
    override fun getLayoutId(): Int = R.layout.fragment_first_child


}

package com.waihong.androidbaseprojecttestapp.module.child_fragment.second


import com.waihong.androidbaseprojectmodule.base.fragment.BaseFragment

import com.waihong.androidbaseprojecttestapp.R
import kotlinx.android.synthetic.main.fragment_second_child.*

class SecondChildFragment : BaseFragment<SecondChildFragmentView, SecondChildFragmentPresenter>(), SecondChildFragmentView{
    override fun setText(string: String) {

        textview_secondchildfragment.text = string
    }

    override var string: String = ""

    override fun getLayoutId(): Int = R.layout.fragment_second_child




}

package com.waihong.androidbaseprojecttestapp.module.child_fragment.second

import com.waihong.androidbaseprojectmodule.base.fragment.BaseFragmentView

interface SecondChildFragmentView : BaseFragmentView {

    var string : String


    fun setText(string : String)
}
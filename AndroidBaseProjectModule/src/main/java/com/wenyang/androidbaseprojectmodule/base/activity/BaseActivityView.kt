package com.wenyang.androidbaseprojectmodule.base.activity

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import com.wenyang.androidbaseprojectmodule.base.BaseView

interface BaseActivityView : BaseView {

    fun showFragment(@IdRes containerViewId: Int, fragment: Fragment)
}
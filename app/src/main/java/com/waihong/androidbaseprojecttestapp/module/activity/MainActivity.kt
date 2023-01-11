package com.waihong.androidbaseprojecttestapp.module.activity

import com.waihong.androidbaseprojectmodule.base.activity.BaseActivity
import com.waihong.androidbaseprojecttestapp.R

class MainActivity : BaseActivity<MainActivityView,MainActivityPresenter>(), MainActivityView {
    override fun getLayoutResId(): Int = R.layout.activity_main

}

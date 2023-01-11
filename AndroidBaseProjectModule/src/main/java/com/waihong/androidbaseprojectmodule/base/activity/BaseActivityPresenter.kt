package com.waihong.androidbaseprojectmodule.base.activity

import com.waihong.androidbaseprojectmodule.base.BasePresenter

abstract class BaseActivityPresenter<out V : BaseActivityView>(view : V)
    : BasePresenter<V>(view) {

}
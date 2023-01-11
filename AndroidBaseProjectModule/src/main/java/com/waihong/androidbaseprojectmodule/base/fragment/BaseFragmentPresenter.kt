package com.waihong.androidbaseprojectmodule.base.fragment

import com.waihong.androidbaseprojectmodule.base.BasePresenter


abstract class BaseFragmentPresenter<out V : BaseFragmentView>(view : V) : BasePresenter<V>(view) {


}
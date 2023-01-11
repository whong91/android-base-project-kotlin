package com.waihong.androidbaseprojectmodule.base.dialog_fragment

import com.waihong.androidbaseprojectmodule.base.fragment.BaseFragmentPresenter

abstract class BaseDialogFragmentPresenter< out V : BaseDialogFragmentView>(view : V)
    : BaseFragmentPresenter<V>(view){

}
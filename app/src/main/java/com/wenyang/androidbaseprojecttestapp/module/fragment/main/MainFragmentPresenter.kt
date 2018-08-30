package com.wenyang.androidbaseprojecttestapp.module.fragment.main

import com.wenyang.androidbaseprojectmodule.base.fragment.BaseFragmentPresenter
import com.wenyang.androidbaseprojectmodule.dagger.scope.PerFragment
import javax.inject.Inject

@PerFragment
class MainFragmentPresenter @Inject constructor(view: MainFragmentView) : BaseFragmentPresenter<MainFragmentView>(view){

}
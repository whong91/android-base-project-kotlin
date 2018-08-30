package com.wenyang.androidbaseprojecttestapp.module.child_fragment.second

import com.wenyang.androidbaseprojectmodule.base.fragment.BaseFragmentPresenter
import com.wenyang.androidbaseprojectmodule.dagger.scope.PerChildFragment
import javax.inject.Inject

@PerChildFragment
class SecondChildFragmentPresenter @Inject constructor(view: SecondChildFragmentView)
    : BaseFragmentPresenter<SecondChildFragmentView>(view){



}
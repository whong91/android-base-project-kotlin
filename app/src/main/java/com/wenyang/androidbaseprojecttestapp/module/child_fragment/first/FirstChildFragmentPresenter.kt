package com.wenyang.androidbaseprojecttestapp.module.child_fragment.first

import android.os.Bundle
import com.wenyang.androidbaseprojectmodule.base.fragment.BaseFragmentPresenter
import com.wenyang.androidbaseprojectmodule.dagger.scope.PerChildFragment
import javax.inject.Inject

@PerChildFragment
class FirstChildFragmentPresenter @Inject constructor(view : FirstChildFragmentView)
    : BaseFragmentPresenter<FirstChildFragmentView>(view){


    override fun onStart(savedInstanceState: Bundle?) {
        super.onStart(savedInstanceState)


    }
}
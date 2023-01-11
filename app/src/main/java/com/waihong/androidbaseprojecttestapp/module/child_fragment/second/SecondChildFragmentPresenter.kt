package com.waihong.androidbaseprojecttestapp.module.child_fragment.second

import android.os.Bundle
import com.waihong.androidbaseprojectmodule.base.fragment.BaseFragmentPresenter
import com.waihong.androidbaseprojectmodule.dagger.scope.PerChildFragment
import javax.inject.Inject

@PerChildFragment
class SecondChildFragmentPresenter @Inject constructor(view: SecondChildFragmentView)
    : BaseFragmentPresenter<SecondChildFragmentView>(view){


    override fun onStart(savedInstanceState: Bundle?) {
        super.onStart(savedInstanceState)

        view.setText(view.string)
    }
}
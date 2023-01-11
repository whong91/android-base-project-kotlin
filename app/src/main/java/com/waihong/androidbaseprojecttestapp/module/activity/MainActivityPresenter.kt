package com.waihong.androidbaseprojecttestapp.module.activity

import android.os.Bundle
import com.waihong.androidbaseprojectmodule.base.activity.BaseActivityPresenter
import com.waihong.androidbaseprojecttestapp.R
import com.waihong.androidbaseprojecttestapp.dagger.utility.PerActivityUtility
import com.waihong.androidbaseprojecttestapp.module.fragment.main.MainFragment
import javax.inject.Inject

class MainActivityPresenter @Inject constructor(view: MainActivityView, val perActivityUtility: PerActivityUtility)
    : BaseActivityPresenter<MainActivityView>(view){


    override fun onStart(savedInstanceState: Bundle?) {
        super.onStart(savedInstanceState)

        perActivityUtility.showFragment(R.id.framelayout_main, MainFragment() )
    }
}
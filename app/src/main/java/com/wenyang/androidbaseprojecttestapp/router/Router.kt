package com.wenyang.androidbaseprojecttestapp.router

import android.support.v7.app.AppCompatActivity
import com.wenyang.androidbaseprojectmodule.dagger.scope.PerActivity
import com.wenyang.androidbaseprojectmodule.router.BaseRouter
import javax.inject.Inject

@PerActivity
class Router @Inject constructor(activity: AppCompatActivity) : BaseRouter(activity){


}
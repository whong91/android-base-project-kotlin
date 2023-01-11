package com.waihong.androidbaseprojecttestapp.router

import androidx.appcompat.app.AppCompatActivity
import com.waihong.androidbaseprojectmodule.dagger.scope.PerActivity
import com.waihong.androidbaseprojectmodule.router.BaseRouter
import javax.inject.Inject

@PerActivity
class Router @Inject constructor(activity: AppCompatActivity) : BaseRouter(activity){


}
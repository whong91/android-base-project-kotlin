package com.wenyang.androidbaseprojecttestapp.app

import android.app.Activity
import android.app.Application
import com.wenyang.androidbaseprojecttestapp.dagger.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


class TestApplication : Application(), HasActivityInjector {


    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

//            if (LeakCanary.isInAnalyzerProcess(this)) {
//                return
//            }
//
//            LeakCanary.install(this)

        DaggerApplicationComponent.builder().create(this).inject(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

}
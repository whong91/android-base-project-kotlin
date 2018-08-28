package com.wenyang.androidbaseprojectmodule.dagger.module

import android.app.Activity
import android.content.Context
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import com.wenyang.androidbaseprojectmodule.dagger.scope.PerActivity
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
abstract class BaseActivityModule {

    @Module
    companion object {

        const val ACTIVITY_FRAGMENT_MANAGER = "BaseActivityModule.activityFragmentManager"

        const val CONTEXT = "BaseActivityModule.Context"

        @JvmStatic
        @Provides
        @Named(ACTIVITY_FRAGMENT_MANAGER)
        @PerActivity
        fun activityFragmentManager(activity: AppCompatActivity): FragmentManager =
                activity.supportFragmentManager
    }

    @Binds
    @PerActivity
    abstract fun activity(appCompatActivity: AppCompatActivity): Activity

    @Binds
    @PerActivity
    abstract fun activityContext(activity: Activity): Context
//
//    @Binds
//    @PerActivity
//    abstract fun activityView(baseActivity: BaseActivity<*,*>) : BaseActivityView

}
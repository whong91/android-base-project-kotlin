package com.waihong.androidbaseprojecttestapp.dagger.module

import android.app.Application
import android.content.Context
import com.waihong.androidbaseprojectmodule.dagger.scope.PerActivity
import com.waihong.androidbaseprojecttestapp.app.TestApplication
import com.waihong.androidbaseprojecttestapp.module.activity.MainActivity
import com.waihong.androidbaseprojecttestapp.module.activity.MainActivityModule
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Named
import javax.inject.Singleton

@Module(includes =
[
    AndroidSupportInjectionModule::class

])
abstract class ApplicationModule {

    @Module
    companion object {
        const val CONTEXT = "ApplicationModule.Context"

    }

    @Binds
    @Singleton
    abstract fun application(app: TestApplication): Application

    @Binds
    @Named(CONTEXT)
    @Singleton
    abstract fun context(app: TestApplication): Context

    @PerActivity
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun mainActivityInjector(): MainActivity


}
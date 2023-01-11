package com.waihong.androidbaseprojecttestapp.dagger.component

import com.waihong.androidbaseprojecttestapp.app.TestApplication
import com.waihong.androidbaseprojecttestapp.dagger.module.ApplicationModule
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent : AndroidInjector<TestApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<TestApplication>()
}
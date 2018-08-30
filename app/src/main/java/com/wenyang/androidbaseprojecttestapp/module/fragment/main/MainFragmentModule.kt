package com.wenyang.androidbaseprojecttestapp.module.fragment.main

import android.support.v4.app.Fragment
import com.wenyang.androidbaseprojectmodule.dagger.module.BaseFragmentModule
import com.wenyang.androidbaseprojectmodule.dagger.scope.PerFragment
import dagger.Binds
import dagger.Module

@Module(includes = [BaseFragmentModule::class])
abstract class MainFragmentModule {

    @Binds
    @PerFragment
    abstract fun fragment(mainFragment: MainFragment): Fragment


    @Binds
    @PerFragment
    abstract fun mainFragmentView(mainFragment: MainFragment): MainFragmentView
}
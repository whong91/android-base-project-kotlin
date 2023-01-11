package com.waihong.androidbaseprojecttestapp.module.child_fragment.first

import androidx.fragment.app.Fragment
import com.waihong.androidbaseprojectmodule.dagger.module.BaseChildFragmentModule
import com.waihong.androidbaseprojectmodule.dagger.scope.PerChildFragment
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module(includes = [BaseChildFragmentModule::class])
abstract class FirstChildFragmentModule {

    @Binds
    @Named(BaseChildFragmentModule.CHILD_FRAGMENT)
    @PerChildFragment
    abstract fun fragment(mainFragment: FirstChildFragment): Fragment

    @Binds
    @PerChildFragment
    abstract fun mainFragmentView(mainFragment: FirstChildFragment): FirstChildFragmentView
}
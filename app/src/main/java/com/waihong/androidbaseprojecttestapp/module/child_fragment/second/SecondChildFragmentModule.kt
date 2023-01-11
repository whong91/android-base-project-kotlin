package com.waihong.androidbaseprojecttestapp.module.child_fragment.second

import androidx.fragment.app.Fragment
import com.waihong.androidbaseprojectmodule.dagger.module.BaseChildFragmentModule
import com.waihong.androidbaseprojectmodule.dagger.scope.PerChildFragment
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module(includes = [BaseChildFragmentModule::class])
abstract class SecondChildFragmentModule{


    @Binds
    @PerChildFragment
    @Named(BaseChildFragmentModule.CHILD_FRAGMENT)
    abstract fun fragment(secondChildFragment: SecondChildFragment): Fragment

    @Binds
    @PerChildFragment
    abstract fun secondChildFragmentView(secondChildFragment: SecondChildFragment): SecondChildFragmentView


}
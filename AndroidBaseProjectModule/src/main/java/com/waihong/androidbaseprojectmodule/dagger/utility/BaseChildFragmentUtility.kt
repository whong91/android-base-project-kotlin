package com.waihong.androidbaseprojectmodule.dagger.utility

import androidx.fragment.app.Fragment
import com.waihong.androidbaseprojectmodule.dagger.module.BaseChildFragmentModule
import javax.inject.Named

abstract class BaseChildFragmentUtility constructor(@Named(BaseChildFragmentModule.CHILD_FRAGMENT) private val childFragment: Fragment) {


}
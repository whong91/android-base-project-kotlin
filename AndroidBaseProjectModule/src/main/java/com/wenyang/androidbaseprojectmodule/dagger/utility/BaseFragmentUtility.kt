package com.wenyang.androidbaseprojectmodule.dagger.utility

import android.support.v4.app.Fragment
import com.wenyang.androidbaseprojectmodule.dagger.module.BaseFragmentModule
import javax.inject.Named


abstract class BaseFragmentUtility constructor(@Named(BaseFragmentModule.FRAGMENT) private val fragment: Fragment) {


}
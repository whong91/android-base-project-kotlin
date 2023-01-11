package com.waihong.androidbaseprojecttestapp.helper

import android.content.Context
import com.waihong.androidbaseprojectmodule.dagger.scope.PerActivity
import com.waihong.androidbaseprojectmodule.utility.helper.BaseDialogHandler
import javax.inject.Inject

@PerActivity
class DialogHandler @Inject constructor(context: Context) : BaseDialogHandler(context){



}
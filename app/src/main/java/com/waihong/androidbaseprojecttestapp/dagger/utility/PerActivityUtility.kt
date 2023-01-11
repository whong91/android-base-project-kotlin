package com.waihong.androidbaseprojecttestapp.dagger.utility

import androidx.appcompat.app.AppCompatActivity
import com.waihong.androidbaseprojectmodule.dagger.scope.PerActivity
import com.waihong.androidbaseprojectmodule.dagger.utility.BaseActivityUtility
import com.waihong.androidbaseprojectmodule.utility.helper.ProgressBarHandler
import com.waihong.androidbaseprojecttestapp.router.Router
import com.waihong.androidbaseprojecttestapp.helper.DialogHandler
import javax.inject.Inject

@PerActivity
class PerActivityUtility @Inject constructor(activity: AppCompatActivity, dialogHandler: DialogHandler,
                                             progressBarHandler: ProgressBarHandler,
                                             router : Router)
    : BaseActivityUtility(activity,progressBarHandler, dialogHandler, router){



}
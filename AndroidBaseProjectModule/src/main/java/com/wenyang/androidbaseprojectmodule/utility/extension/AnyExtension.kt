package com.wenyang.androidbaseprojectmodule.utility.extension

import android.util.Log
import java.util.logging.Logger

fun <T: Any> T.log(message : String){
    Log.d(this::class.java.simpleName, message )
}
package com.wenyang.androidbaseprojectmodule.utility.extension

import android.support.design.widget.TextInputEditText
import android.support.design.widget.TextInputLayout

/**
 * Created by wenyang on 15/11/17.
 */


fun TextInputEditText.showErrorInLayout(stringResId: Int?){

    val textInputLayout = this.parent.parent as? TextInputLayout ?: return

    if(stringResId == null) {
        textInputLayout.isErrorEnabled = false
        return
    }

    textInputLayout.isErrorEnabled = true
    textInputLayout.error = context.getString(stringResId)

}
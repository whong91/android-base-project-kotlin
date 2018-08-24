package com.wenyang.androidbaseprojectmodule

import android.content.Context
import android.graphics.Color
import android.support.v4.content.ContextCompat


fun Context.color(id: Int) : Int = ContextCompat.getColor(this, id)

fun Int.getColorWithAlpha(ratio : Float) : Int{

    val alpha = Math.round(Color.alpha(this) * ratio * 100)

    val r = Color.red(this)
    val g = Color.green(this)
    val b = Color.blue(this)

    return Color.argb(alpha,r,g,b)

}
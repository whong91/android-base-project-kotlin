package com.wenyang.androidbaseprojectmodule.utility.extension

import android.webkit.MimeTypeMap

fun String.getMimeType() : String?{

    val extension = MimeTypeMap.getFileExtensionFromUrl(this) ?: return null

    return when (extension) {
        "json" -> {
            "text/json"
        }

        "js" -> {
            "text/javascript"
        }

        "xhtml" -> {
            "text/html"
        }

        else -> {

            MimeTypeMap.getSingleton().getMimeTypeFromExtension(extension)
        }
    }
}
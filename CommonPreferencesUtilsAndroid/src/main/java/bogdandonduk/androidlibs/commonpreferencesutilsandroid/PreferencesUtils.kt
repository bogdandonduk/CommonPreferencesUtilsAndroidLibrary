package bogdandonduk.androidlibs.commonpreferencesutilsandroid

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import android.os.Build


object PreferencesUtils {
    fun getSharedPreferences(context: Context, name: String = "sharedprefs_" + context.packageName) : SharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE)

    @SuppressLint("AnnotateVersionCheck")
    fun differentiateApiLevel(apiLevel: Int, higherOrEqualAction: () -> Unit, lowerAction: () -> Unit) {
        if(Build.VERSION.SDK_INT >= apiLevel)
            higherOrEqualAction.invoke()
        else
            lowerAction.invoke()
    }
}
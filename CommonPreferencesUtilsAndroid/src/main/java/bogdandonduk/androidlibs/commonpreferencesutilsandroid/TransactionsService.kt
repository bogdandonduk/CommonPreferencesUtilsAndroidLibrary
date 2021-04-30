package bogdandonduk.androidlibs.commonpreferencesutilsandroid

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle

object TransactionsService {
    fun openActivity(context: Context, activityClass: Class<out Activity>, currentActivityTracker: Activity?, options: Bundle? = null) {
        if(currentActivityTracker == null || currentActivityTracker::class.java != activityClass)
            context.startActivity(
                Intent(context, activityClass).apply {
                    if(context !is Activity) flags = Intent.FLAG_ACTIVITY_NEW_TASK
                }, options
            )
    }
}
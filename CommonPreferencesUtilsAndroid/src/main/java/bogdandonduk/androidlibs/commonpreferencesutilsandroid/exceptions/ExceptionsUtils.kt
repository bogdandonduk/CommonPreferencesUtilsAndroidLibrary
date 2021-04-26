package bogdandonduk.androidlibs.commonpreferencesutilsandroid.exceptions

object ExceptionsUtils {
    fun run(tryAction: () -> Unit, vararg exceptionalActions: Pair<Class<out Throwable>, () -> Unit>) {
        try {
            tryAction.invoke()
        } catch (thr: Throwable) {
            exceptionalActions.forEach {
                if(thr::class.java == it.first) it.second.invoke()
            }
        }
    }
}
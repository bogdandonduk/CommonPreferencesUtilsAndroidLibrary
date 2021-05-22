package bogdandonduk.androidlibs.commonpreferencesutilsandroid

import android.annotation.SuppressLint
import android.content.Context
import android.os.VibrationEffect
import android.os.Vibrator

@SuppressLint("NewApi")
object VibrationUtils {
    fun vibrateOneShot(context: Context, duration: Long, amplitude: Int = VibrationEffect.DEFAULT_AMPLITUDE) {
        PreferencesUtils.differentiateApiLevel(
            apiLevel = 26,
            higherOrEqualAction = {
                (context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(VibrationEffect.createOneShot(duration, amplitude))
            },
            lowerAction = {
                (context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator).vibrate(50)
            }
        )
    }
}
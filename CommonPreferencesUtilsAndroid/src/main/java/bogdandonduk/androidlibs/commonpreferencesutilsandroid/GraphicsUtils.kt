package bogdandonduk.androidlibs.commonpreferencesutilsandroid

import android.graphics.Color
import androidx.annotation.ColorInt
import androidx.core.graphics.ColorUtils

object GraphicsUtils {
    fun getRippleColor(@ColorInt backgroundColor: Int) =
        if(ColorUtils.calculateLuminance(backgroundColor) > 0.5)
            Color.argb(55, 0, 0, 0)
        else
            Color.argb(55, 255, 255, 255)
}
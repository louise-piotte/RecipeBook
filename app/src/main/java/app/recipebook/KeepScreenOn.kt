package app.recipebook

import android.view.WindowManager
import androidx.activity.ComponentActivity

internal fun ComponentActivity.keepScreenOnWhileInUse() {
    window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
}

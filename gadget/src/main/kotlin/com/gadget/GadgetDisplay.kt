package com.gadget

import android.app.Dialog
import android.content.Context
import android.content.res.Resources
import android.graphics.Point
import android.os.Build
import android.view.ViewGroup
import android.view.WindowManager

object GadgetDisplay {

    fun dpToPx(dp: Int): Int = (dp * Resources.getSystem().displayMetrics.density).toInt()
    fun dpToPx(dp: Float): Float = (dp * Resources.getSystem().displayMetrics.density)
    fun dpToPx(dp: Double): Double = (dp * Resources.getSystem().displayMetrics.density)
    fun pxToDp(px: Int): Int = (px / Resources.getSystem().displayMetrics.density).toInt()
    fun pxToDp(px: Float): Float = (px / Resources.getSystem().displayMetrics.density)
    fun pxToDp(px: Double): Double = (px / Resources.getSystem().displayMetrics.density)

    /**
     * 다이얼로그 화면 크기 조정
     */
    fun setDialogWidthResize(context: Context, dialog: Dialog?, width: Float) {
        val windowManager = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager

        if (Build.VERSION.SDK_INT < 30){
            val display = windowManager.defaultDisplay
            val size = Point()

            display.getSize(size)

            val window = dialog?.window

            val x = (size.x * width).toInt()
            val y = ViewGroup.LayoutParams.WRAP_CONTENT
            window?.setLayout(x, y)
        } else {
            val rect = windowManager.currentWindowMetrics.bounds

            val window = dialog?.window

            val x = (rect.width() * width).toInt()
            val y = ViewGroup.LayoutParams.WRAP_CONTENT

            window?.setLayout(x, y)
        }
    }
}

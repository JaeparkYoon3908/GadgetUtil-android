package com.gadget

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import java.io.File
import java.io.FileInputStream

object GadgetFile {
    fun pathToBitmap(path: String): Bitmap? {
        return try {
            val f = File(path)
            val options = BitmapFactory.Options()
            options.inPreferredConfig = Bitmap.Config.ARGB_8888
            BitmapFactory.decodeStream(FileInputStream(f), null, options)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    fun byteToInt(src: ByteArray): Int {
        val s1 = src[0].toInt() and 0xFF
        val s2 = src[1].toInt() and 0xFF
        val s3 = src[2].toInt() and 0xFF
        val s4 = src[3].toInt() and 0xFF
        return (s1 shl 24) + (s2 shl 16) + (s3 shl 8) + (s4 shl 0)
    }
}
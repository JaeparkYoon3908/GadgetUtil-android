package com.gadget

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object GadgetDate {
    /** yyyy.MM.dd HH:mm */
    const val DateFormat = "yyyy.MM.dd HH:mm"
    /** yyyy.MM.dd HH:mm:ss */
    const val DateFormat2 = "yyyy.MM.dd HH:mm:ss"
    /** yyyy-MM-dd */
    const val DateFormat3 = "yyyy-MM-dd"
    /** yyyyMMdd */
    const val DateFormat4 = "yyyyMMdd"

    val dayOfWeeksKoreaHashMap = hashMapOf(
        "Mon" to "월요일",
        "Tue" to "화요일",
        "Wen" to "수요일",
        "Wed" to "수요일",
        "Thu" to "목요일",
        "Fri" to "금요일",
        "Sat" to "토요일",
        "Sun" to "일요일",
    )
    val dayOfMonthHashMap = hashMapOf(
        "Jan" to "01", "Feb" to "02", "Mar" to "03",
        "Apr" to "04", "May" to "05", "Jun" to "06",
        "Jul" to "07", "Aug" to "08", "Sep" to "09",
        "Oct" to "10", "Nov" to "11", "Dec" to "12"
    )

    fun getTodayKorea(format: String): String {
        val currentTime: Long = System.currentTimeMillis()
        val todayDate = Date(currentTime)
        val simpleFormat = SimpleDateFormat(format, Locale.KOREA)
        return simpleFormat.format(todayDate)
    }
}
package SingletonObject

import SingletonObject.Class.TextUtil

fun main() {
//    val textUtil = TextUtil() // Error

//    Untuk mengakses singleton object bisa di lihat di bawah ini
    println(TextUtil.toUpperFirst("hari setiaji"))

    println(TextUtil.toLower("HARI SETIAJI"))

    println(TextUtil.toUpper("hari setiaji"))
}
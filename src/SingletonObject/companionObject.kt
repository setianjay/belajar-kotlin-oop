package SingletonObject

import SingletonObject.Class.CompanionObject

fun main() {
//    Pemanggilan inner object tanpa Companion Object
    println(CompanionObject.textUtil.toUpper("hari setiaji"))

//    Pemanggilan inner object yang memakai Companion Object
    println(CompanionObject.toLower("HARI SETIAJI"))
}
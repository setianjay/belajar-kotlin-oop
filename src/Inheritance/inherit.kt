package Inheritance

import Inheritance.Class.Child


fun main() {
    val child = Child()
    var result = ""

    result = child.toUpper("hari setiaji")
    println(result)

    result  = child.toLower("HARI SETIAJI")
    println(result)

    result = child.ucWord("aprilia putri hidayat")
    println(result)
}
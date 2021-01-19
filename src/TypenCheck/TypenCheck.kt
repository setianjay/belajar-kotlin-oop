package TypenCheck

import TypenCheck.Class.Fruit
import TypenCheck.Class.Vegetable

fun printObject(any: Any){
    when(any){
        is Fruit -> println("Ini adalah sayur ${any.name} dan harganya sekitar ${any.price}")
        is Vegetable -> println("Ini adalah buah ${any.name} dan harganya sekitar ${any.price}")
        else -> return println(any)
    }
}

fun main() {
    printObject(Fruit("Semangka",15000))
    printObject(Vegetable("Bayam", 3500))
    printObject(1)
    printObject("Hari Setiaji")
}
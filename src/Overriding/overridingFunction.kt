package Overriding

import Overriding.Class.Parent2
import Overriding.Class.Child1
import Overriding.Class.Child2

fun main() {
    val parent = Parent2()
    println(parent.number)

    val child1 = Child1()
    println(child1.number)

    val child2 = Child2()
    println(child2.number)

}
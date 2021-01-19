package Overriding.Class

// Properties Overriding
open class Parent2 {
    open val number = 1
}

open class Child1: Parent2() {
    override val number = 2
}

class Child2: Child1(){
    override val number: Int
        get() = 3
}
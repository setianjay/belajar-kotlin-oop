package Overriding.Class

// Function Overriding
open class Parent(open val name: String) {
    open fun sayHello(name:String){
        println("Hello $name, my name is ${this.name}")
    }
}
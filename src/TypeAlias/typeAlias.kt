package TypeAlias

import TypeAlias.Class.Application

typealias app = Application // Class Application di alias kan menjadi app

// Type alias untuk function
typealias iniString = () -> String // Tipe data String di alias kan menjadi iniString

fun sayHello(name: iniString){
    println("Hello my name is ${name()}")
}

fun main() {
    val app = app("Offline Pos")
    println(app)

    sayHello { "Hari Setiaji" }
}
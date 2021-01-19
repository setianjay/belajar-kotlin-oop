package LateInit

import LateInit.Class.Laptop

/*
* Note :
* lateinit di gunakan agar pada saat pendeklarasian variable atau properties kita tidak wajib
* memasukan deklarasi nilai dari propreties yang kita buat.
* */

fun main() {
  val laptop = Laptop()
    /* ERROR karena kita belum mendeklarasi data dari properties.
    println(laptop.brand) // Error
    println(laptop.type) // Error
    */

//    println(laptop.initializeProperties("HP","15G005AX"))
//    println(laptop.brand)
//    println(laptop.type)
//    println(laptop.price)
    if (laptop.initializeProperties("","") != 0){
        println("The brand of laptop is ${laptop.brand} and the type is ${laptop.type}")
    }else{
        println("The brand and type of laptop is unknown")
    }
}
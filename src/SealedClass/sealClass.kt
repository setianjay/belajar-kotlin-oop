package SealedClass

import SealedClass.Class.Minus
import SealedClass.Class.Operation
import SealedClass.Class.Plus


/* Note :
* SealedClass baik di gunakan untuk inheritance, Sealed Class sama dengan Abstract Class yang mana jika suatu
* class di deklarasi sebagai Sealed Class atau Abstract Class maka class tersebut tidak bisa di inisialisasikan
* menjadi object, hanya bisa di gunakan untuk inheritance.
* */
fun operation(value1: Int, value2: Int, operation: Operation): Int{
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
    }
}

fun main() {
    println(operation(1,3,Plus()))
    println(operation(1,3,Minus()))
}
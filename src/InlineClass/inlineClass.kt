package InlineClass

import InlineClass.Class.Motorcycle

/*
    Note :
    - Inline Class di gunakan apabila kita membuat class yang mana isinya hanya terdapat 1
    1 properties saja.

    - Jika membuat class menjadi Inline Class maka wajib bagi kita membuat 1 properties pada constructor,
    kalau lebih dari 1 maka akan terjadi error.

    - Untuk pembuatan function bebas mau sampai berapa saja.

    - Terlalu banyak class memiliki konsekuensi aplikasi menjadi lamban.
 */

fun main() {
    val motor = Motorcycle("Yamaha")
    motor.motorName()
}
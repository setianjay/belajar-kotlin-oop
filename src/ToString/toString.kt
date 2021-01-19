package ToString

import ToString.Class.Login

fun main() {
    /*
    * Note :
    * toString() berfungsi untuk memberi tahu representasi string dari object.
    * standarnya toString() akan mengembalikan kode reference unik dari object.
    * kita juga bisa meng override function toString() sesuai yang kita mau.
    */

    val login = Login()
    println(login)
    login.username = "admin"

    println(login.username.toString())
    login.password = "admin"

    println(login.password.toString())
    println(login.password.toString() == login.password.toString())

    val login2 = Login()
    println(login2)

    login2.username = "admin"
    login2.password = "admin123"

    println(login.username.toString() == login2.password.toString())

    println(login.toString() == login2.toString())


}
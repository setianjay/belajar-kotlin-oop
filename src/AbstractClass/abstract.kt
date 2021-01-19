package AbstractClass

import AbstractClass.Class.Rektor
import AbstractClass.Class.University


/*
* Note :
* Abstract Class adalah class yang tidak bisa di inisialisasikan menjadi object, class tersebut
* hanya bisa di gunakan sebagai inheritance atau class turunan.
*
* Secara default function yang di deklarasi sebagai abstarct class itu dia mempunyai deklarasi
* open jadi class tersebut bisa menjadi class turunan tanpa harus menambahkan deklarasi open
* pada bagian depan class nya.
*
*/

fun main() {
    // Mencoba menginisialisasikan class University menjadi object
    // val univ = University("LP3I Jakarta Campus Depok") (Error)

    val rektor = Rektor("Hari Setiaji", "University Technology Citayam")
    println(rektor)
}
package VisibilityModifier

import VisibilityModifier.Class.Teacher

/*
* Note :
* Public    = Jika class,interface,properties,function bersifat Public maka mereka dapat di akses dari mana saja.
* Private   = Jika class, interface, properties, function bersifat Private maka mereka hanya dapat di akses
*             di tempat pendeklarasiiannya.
* Protected = Jika class, interface, properties, function bersifat Protected maka mereka bisa di akses
*             di tempat pendeklarasiannya dan juga di child atau turunannya.
* Internal  = Jika class, interface, properties, function bersifat Internal maka mereka bisa di akses
*             selama masih dalam 1 project aplikasi. */

fun main() {
    val teacher = Teacher()
    teacher.teacherName("Hari Setiaji")
}
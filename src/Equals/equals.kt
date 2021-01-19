package Equals

import Equals.Class.Person

fun main() {
    val person = Person()

    person.firstName = "Hari"
    person.lastName = "Hari"

    println(person.firstName == person.lastName)

}
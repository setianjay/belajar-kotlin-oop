package SetterGetter

import SetterGetter.Class.Baby

fun main() {
    val baby = Baby()

    println(baby.babyName) // Getter

    baby.babyName = null // Setter
    println(baby.babyName) // Getter

    baby.babyName = "hari setiaji" // Setter
    println(baby.babyName) // Getter
}
package EnumClass

import EnumClass.Class.Gender

/* Note :
* Enum Class adalah representasi class yang sudah tetap nilainya,
* contohnya seperti jenis kelamin, arah mata angin, dll.*/

fun main() {
    val male = Gender.MALE
    val female = Gender.FEMALE

    println(male)
    println(female)
}
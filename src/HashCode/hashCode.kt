package HashCode

import HashCode.Class.Person

fun main(){
    /* Note :
    * hasCode() berfungsi untuk merepresentasikan kode unik dari object yang kita buat.
    * */

    val person = Person()
    person.firstName = "Setiaji"
    person.lastName = "Setiaji"

    // true, karena value dari firstName dan lastName sama
    println(person.firstName.hashCode() == person.lastName.hashCode())
}
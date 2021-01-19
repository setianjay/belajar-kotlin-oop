package AbstractPropertiesnFunction

import AbstractPropertiesnFunction.Class.Cat

/*
* Note :
* Jika kita memakai abstract pada class, kita juga bisa memakai abstarct terhadap properties maupun function.
*
* Jika properties atau function yang di deklarasi sebagai abstract, maka nilai atau value dari properties
* atau function tersebut harus di deklarasi value atau nilainya pada class childnya(override).
* */

fun main() {
    val cat = Cat()

    println(cat.name)

    cat.run("14 km/jam")
}
package InnerClass

import InnerClass.Class.Boss
import InnerClass.Class.Boss.Employee


/* Note:
* Outer Class adalah class yang mana di dalamnya ada class dan Outer Class adalah class yang menampung class
* yang ada di dalamnya.
*
* Inner Class adalah class uang mana ada di dalam dari sebuah class(Outer Class).
*
* Untuk pendeklarasian objectnya, kita wajib mendeklarasi Outer Class nya dlu sebelum bisa mengakses
* Inner Class nya.*/
fun main() {
    val boss = Boss("Hari Setiaji")
    val employee = boss.Employee("Adrian")

    employee.sayHi()

}
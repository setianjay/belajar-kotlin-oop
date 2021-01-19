package ExtensionFunction

import ExtensionFunction.Class.Radio

/* Note :
* Extension Function berfungsi sebagai function bantuan yang dapat di buat tanpa harus berada di dalam classnya.
*
* Namun karena function ini di buat di luar kelas apabila ada properties yang ber nilaikan Protected ataupun
* Private maka akan error.
* */

fun Radio.yourRadio(rName:String,rChannel:String){
    this.radioName = rName
    this.radioChannel = rChannel
//    this.radioLocation = "Jl. Raya Citayam" // Error, karena properties radioLocation adalah Private
}

// Extension Properties
val Radio.radioNameUppercase: String
    get() = this.radioName.toUpperCase()
//    set(value) {
//        this.radioName = value.toUpperCase()
//    }

fun main() {
    val radio = Radio()
    radio.yourRadio("HarapBors","99.28FN")
    println("Pantengin terus ${radio.radioName} di ${radio.radioChannel} radio nya anak milenial")
    println(radio.radioNameUppercase)
}
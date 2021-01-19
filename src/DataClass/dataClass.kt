package DataClass

import DataClass.Class.Product

/* Note :
* data class adalah sebuah class yang mana dapat memberikan sesuatu yang spesial khusunya untuk primary
* constructornya, spesialnya adalah secara otomatis semua properties yang ada di dalam primary constructor
* akan dibuatkan toString,equals,hashCode secara otomatis.
* */
fun main() {
    val product = Product("Mie Sedap Soto", 3_500,"Food")
    println(product)
}
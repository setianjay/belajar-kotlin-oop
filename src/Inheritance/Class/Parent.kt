package Inheritance.Class

open class Parent() {
    fun toUpper(string: String): String{
        return string.toUpperCase()
    }

    fun toLower(string: String): String{
        return string.toLowerCase()
    }

    fun ucWord(string: String): String{
        return string.split(" ").map {
            it.capitalize()
        }.joinToString(" ")
    }
}
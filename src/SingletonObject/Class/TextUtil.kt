package SingletonObject.Class

object TextUtil {

    fun toUpper(text: String): String{
        return text.toUpperCase()
    }

    fun toLower(text: String): String{
        return text.toLowerCase()
    }

    fun toUpperFirst(text: String):String{
        return text.split(" ").map {
            it.capitalize()
        }.joinToString(" ")
    }
}
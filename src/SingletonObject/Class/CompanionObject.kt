package SingletonObject.Class

class CompanionObject {
    object textUtil {
        fun toUpper(text: String): String{
            return text.toUpperCase()
        }
    }

    companion object {
        fun toLower(text: String): String{
            return text.toLowerCase()
        }
    }
}
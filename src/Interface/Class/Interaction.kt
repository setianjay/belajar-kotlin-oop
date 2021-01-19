package Interface.Class

interface Interaction {
    val type: String

    fun interaction(): String{
        return this.type
    }
}
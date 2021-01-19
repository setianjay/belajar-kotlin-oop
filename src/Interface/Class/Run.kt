package Interface.Class

interface Run: Interaction {
    var speed: Int
    fun run() {
            println("The $type speed arround $speed km/hour")
    }
}
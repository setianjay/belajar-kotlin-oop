package AbstractPropertiesnFunction.Class

class Cat: Animal() {
    override val name: String
        get() =  "Cat"


    override fun run(speed: String) {
        println("The ${this.name} have speed arround $speed")
    }
}
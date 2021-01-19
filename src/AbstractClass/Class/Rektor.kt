package AbstractClass.Class

class Rektor(val rektorName:String, univName:String): University(univName) {

    override fun toString(): String {
        return "The Rektor at ${this.name} is ${this.rektorName} "
    }

}
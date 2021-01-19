package SetterGetter.Class

class Baby() {
    var babyName: String? = null
    get() {
        println("Ini adalah function getter")
        return field
    }
    set(value) {
        println("Ini adalah function setter")
        if (value == null){
            println("Properties babyName bernilai null")
        }else{
            field = value.toString().split(" ").map {
                it.capitalize()
            }.joinToString(" ")
        }
    }
}
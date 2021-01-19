package VisibilityModifier.Class

class Teacher {
    private var name: String = ""

    fun teacherName(name:String){
        this.name = name
        println("The teacher name is ${this.name}")
    }
}
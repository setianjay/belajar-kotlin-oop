package InnerClass.Class

// Outer Class
class Boss(val bossName: String) {
    // Inner Class
    inner class Employee(val employeName: String){
        fun sayHi(){
            println("Hello my name is ${this.employeName} and my boss name is ${this@Boss.bossName}")
        }
    }
}
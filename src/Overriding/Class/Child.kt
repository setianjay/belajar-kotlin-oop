package Overriding.Class

class Child(name: String, val address: String): Parent(name) {

    override fun sayHello(name: String) {
        /*
        Note : Jika kita memakai fungsi yang di bawah ini, maka fun sayHello yang aslinya akan tereksekusi juga.
        Kalau di ibaratkan itu sama saja seperti kita memanggil fungsinya.
        */
        super.sayHello(name)
        println("Hello $name, my name is ${this.name} and i live in ${this.address}")
    }
}
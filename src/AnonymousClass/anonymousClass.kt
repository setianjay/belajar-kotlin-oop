package AnonymousClass

import AnonymousClass.Class.Cat

fun runAction(cat: Cat){
    cat.run()
}

class sampleAction: Cat{
    override fun run() {
        println("This is sample run")
    }
}

fun main() {
    runAction(sampleAction())
    runAction(object: Cat{
        override fun run() {
            println("Ini adalah anonymous class 1")
        }
    })
    runAction(object: Cat{
        override fun run() = println("Ini adalah anonymous class 2")

    })
}
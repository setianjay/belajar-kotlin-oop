package SealedClass.Class

sealed class Operation(val name: String) {
}

class Plus: Operation("Plus")

class Minus: Operation("Minus")
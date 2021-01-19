package DestructionDeclaration

import DestructionDeclaration.Class.MinMax


fun minmax(value1: Int, value2: Int): MinMax {
    return when{
        value1 > value2 -> MinMax(value2, value1)
        else -> MinMax(value1, value2)
    }
}

fun main() {
    val result = minmax(200,10)
    // Cara 1
    val min = result.min
    val max = result.max
    println(min)
    println(max)

    // Cara 2 (Destruction Function)
    val (nilaiMin,nilaiMax) = result
    println(nilaiMin)
    println(nilaiMax)

}
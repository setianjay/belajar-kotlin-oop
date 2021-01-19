package DestructionDeclaration

import DestructionDeclaration.Class.Game

/*
        Cara 1 terlalu kepanjangan, kita bisa memakai cara "DestructionProperties".

        Desctruction Properties adalah pembuatan multiple variable dari suatu object,
        syarat untuk bisa melakukan Desctruction adalah class harus mempunyai
        function "Component1(),Component2()" dari setiap variable yang dia miliki.

        Data Class adalah class yang mana secara otomatis akan membuatkan function
        "Component1(),Component2()" secara otomatis sesuai dengan variable atau properties
        yang class kita miliki.

        Kita bisa menyingkat cara diatas dengan cara 2 di bawah ini :
*/

fun main() {
    val game = Game("GTA-V",180000)
    // Cara 1
    val name = game.name
    val price = game.price
    println(name)
    println(price)

    // Cara 2(Destruction Properties)
    val (gameName,gamePrice) = game
    println(gameName)
    println(gamePrice)
}
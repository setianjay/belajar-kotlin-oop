package LazyProperties.Class

class Laptop {
    val name: String = "Laptop HP"

    val merk: String by lazy {
        println("Lazy di panggil")
        "Hari Setiaji"
    }
}
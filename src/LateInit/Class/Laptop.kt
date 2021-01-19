package LateInit.Class

class Laptop {
    lateinit var brand: String
    lateinit var type: String
    var price: Int = 0

    fun initializeProperties(brand: String = "", type: String = ""): Int{
        this.brand = brand
        this.type = type
        if (this.brand.isEmpty() && this.type.isEmpty()){
            return 0 // error
        }else{
            return 1 // success
        }
    }

}
package Exception

import Exception.Class.ValidationException

fun validationNSayHello(name: String) {
    if (name.isEmpty()){
        throw ValidationException("Name is empty")
    }else{
        println("Hello $name")
    }
}

fun main() {
    // Mengeluarkan Error Trace
//    validationNSayHello("Hari")
//    validationNSayHello("")

    try {
        validationNSayHello("Hari")
        validationNSayHello("")
    }catch (error: ValidationException){
        println("Terjadi error karena ${error.message}")
    }
}
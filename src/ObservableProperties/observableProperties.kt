package ObservableProperties

import ObservableProperties.Class.Account

/*
* Note :
* Observable di gunakan untuk merekam jejak perubahan value dari suatu variable atau properties.
* */

fun main() {
    val account = Account()
    account.description = "admin"
    account.description = "hari"
}
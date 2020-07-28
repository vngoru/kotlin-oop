package dataclasses

/*
*
*---------------------------------------------------------------------------------------------
* What are DataClasses In Kotlin ?
*---------------------------------------------------------------------------------------------
*
* In Kotlin, you can create a data class to hold the data.
* The reason why would you want to mark a class as data is to let compiler know that you
* are creating this class for holding the data, compiler then creates several functions automatically for
* your data class which would be helpful in managing data.
* In this guide, we will learn data class and the functions that are automatically generated by compiler.
*
*---------------------------------------------------------------------------------------------
* Kotlin Data Class Requirements
*---------------------------------------------------------------------------------------------
*
* 1. The primary constructor of the data class must have at least one parameter.
*    Also, the parameters are either marked val or var.
* 2. The class cannot be marked as open, abstract, sealed or inner.
* 3. The class can extend (inherit) other class and it can also implements other interfaces.
*
* */

data class User(
    var username: String,
    var email: String,
    var phone: String,
    var passord: String
)

fun main() {

    /*
    * Creating an object of the dataclass and passing values
    * */
    var user = User(
        "jnyakush",
        "jnyakush@gmail.com",
        "254746445198",
        "Super1234!"
    )

    println(user)
}
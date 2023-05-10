package Example01

fun main(){
    var isBlank:Boolean = false
    println(isBlank)

    println(isBlank.not())

    isBlank = "".isBlank()
    println(isBlank)

    isBlank = "Oybek".isBlank()
    println(isBlank)
}
package Example02

fun main(){
    var x = sayHi()
    println(x)

    var y = sayHi()
    var d = sayHi()
    var r = sayHi()
    println(y)
    println(d)
    println(r)
}
fun sayHi(): String {
    return ("Hello World")
}
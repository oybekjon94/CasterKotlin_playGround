package Example02

fun main(){
    //referential
    var a = Person("Donn")
    var b = Person("Donn")

    println(a === b)
    println(a !== b)
    // === equality
    // !== inequality
}
class Person(var name:String)
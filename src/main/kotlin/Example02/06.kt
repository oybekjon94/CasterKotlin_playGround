package Example02

fun main(){
    sayHiii()

    //sayBye here error
}
fun sayHiii(){
    println("Hello")

    //sayBye here error
    fun sayBye(){
        println("Bye!")
    }

    sayBye()
}
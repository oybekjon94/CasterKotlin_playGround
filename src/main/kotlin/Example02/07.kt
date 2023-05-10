package Example02

fun main(){
    sayHi1()

    val age = 12

//    fun doWork(){
//        if (age < 12){
//            println("less than 21")
//        }else{
//            println("eligible")
//        }
//    }
    fun doWork() = if (age < 12) println("less than 21") else println("eligible")

    doWork()
}
fun sayHi1() = println("Hi")
package Example03

fun main(){
    printUserInfo2("SHer")
    printUserInfo2("Donn",1,"black")

}
fun printUserInfo2(name:String, age:Int = 21,favColor:String=""){
    println("Name: $name, Age:$age, Fav Color: $favColor")
}
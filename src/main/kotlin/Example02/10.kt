package Example02

fun main(){
    printUserInfo(age = 32, firstName = "John", lastName = "Key", likeMOvies = false)
    printUserInfo(age = 34, firstName = "HEy", lastName = "Oll", likeMOvies = true)
    printUserInfo(age = 35, firstName = "Akk", lastName = "Pop", likeMOvies = false)
}
fun printUserInfo(firstName:String,lastName:String,age:Int,likeMOvies:Boolean){
    println("$firstName $lastName is of age $age, like movies $likeMOvies")
}
package Example03

//overloading function
fun main(){
    printUserInfo("Oybek",29,"white")
    printUserInfo("Alli",28)
    printUserInfo("John",43,"black")
    printUserInfo("Bek")
}
fun printUserInfo(name:String){
    println("Name: $name")
}
fun printUserInfo(name:String, age:Int){
    println("Name: $name, Age: $age")
}
fun printUserInfo(name:String, age:Int, favColor:String){
    println("Name: $name, Age: $age,favorite Color $favColor")
}
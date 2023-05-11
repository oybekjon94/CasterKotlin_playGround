package Example03

fun main(){
    printBookInfo2("Green Eggs and Ham","Dr Seuss","John")
}
fun printBookInfo2(title:String, vararg authors:String){
    println("$title - Author: $authors")
    authors.forEach { println(it) }
}
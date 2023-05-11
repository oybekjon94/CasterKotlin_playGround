package Example03

fun main(){
    printBookInfo("Green Eggs and Ham","Dr Seuss")
    printBookInfo("Green Eggs and Ham","Dr Seuss","John")
}
fun printBookInfo(title:String, author:String){
    println("$title - Author: $author")
}
fun printBookInfo(title:String, author:String, author2:String){
    println("$title - Author: $author, $author2")
}
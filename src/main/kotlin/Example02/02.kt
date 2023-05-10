package Example02

fun main(){
    var firstName:String = "Donn"
    var length = firstName.length

    var lastName:String? = "Felker"
    var length2 = lastName?.length  //null or 6

    var length3 = if (lastName != null) lastName.length else 0 // 6 or 0

    var length4 = lastName?.substring(0,2)?.length

    var length5 = lastName?.substring(0, 5)?.drop(2)?.substring(2,3)?.length

    println(length)
    println(length2)
    println(length3)
    println(length4)
    println(length5)
}
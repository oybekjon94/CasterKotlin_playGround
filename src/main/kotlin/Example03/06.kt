package Example03

fun main(){
    var user = User2(firstName = "Oybek","Kholikov")
    println(user.fullName)

    user.fullName = "Jon"
    println(user.fullName)

    user.fullName = "Jane Sparks"
    println(user.fullName)
}

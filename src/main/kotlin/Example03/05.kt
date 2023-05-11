package Example03

fun main(){
    var user = User()
    user.firstName = "Oybek"
    user.lastName = "Kholikov"
    user.printFullName()
    user.printWithPrefix("Sherbek")

    var friend = User()
    friend.firstName = "Abduqodir"
    friend.lastName = "Isroilov"
    friend.printFullName()
}
class User{
    var firstName:String = ""
    var lastName:String = ""

    fun printFullName(){
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix:String){
        println("$prefix $lastName")
    }
}
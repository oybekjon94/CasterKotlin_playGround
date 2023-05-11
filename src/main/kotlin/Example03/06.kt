package Example03

fun main(){
    var user = User2()
    user.firstName = "Oybek"
    user.lastName = "Kholikov"
    user.printFullName()
    user.printWithPrefix("Sherbek")
    user.updateName("Otabek")
    user.printFullName()

    var friend = User2()
    friend.firstName = "Abduqodir"
    friend.lastName = "Isroilov"
    friend.printFullName()
}
class User2{
    var firstName:String = ""
    var lastName:String = ""

    fun printFullName(){
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix:String){
        println("$prefix $lastName")
    }

    fun updateName(newName:String){
        firstName = newName
    }
}
package Example03

fun main(){
    var user = User2(firstName = "Oybek", lastName = "Khollikov")
    user.printFullName()
    user.printWithPrefix("Sherbek")
    user.updateName("Otabek")
    user.printFullName()
    user.firstNameLenght()

    var friend = User2("Abduqodir","Isroilov")
    friend.printFullName()
    friend.firstNameLenght()
}

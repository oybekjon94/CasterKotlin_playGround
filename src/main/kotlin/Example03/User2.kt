package Example03

class User2 constructor(var firstName:String, var lastName:String){

    fun printFullName(){
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix:String){
        println("$prefix $lastName")
    }

    fun updateName(newName:String){
        firstName = newName
    }
    fun firstNameLenght(){
        println(firstName.length)
    }
}
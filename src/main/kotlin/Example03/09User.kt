package Example03

class User4(var fistName:String, var lastName:String){

    companion object{
        const val MAX_AGE = 18
    }

    fun fullName():String = "$fistName - $lastName"

    override fun toString(): String {
        return fullName()
    }
}

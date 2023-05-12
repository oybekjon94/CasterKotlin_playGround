package Example03

class User3(var firstName:String, var lastName:String) {

    companion object {

        val users = mutableListOf<User3>()

        fun createUsers(count:Int):List<User3>{
            for (i in 0..count){
                users.add(User3("FirsName$i", "LastName$i"))
            }
            return users
        }


        fun createUser(firstName: String, lastName: String):User3{
            return User3(firstName, lastName)
        }
    }

    fun fullName():String = "$firstName $lastName}"

    override fun toString(): String {
        return fullName()
    }
}
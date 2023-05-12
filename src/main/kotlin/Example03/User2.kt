package Example03

class User2 (var firstName:String, var lastName:String){

    var fullName = "$firstName $lastName"
    get() = "Name: $field"
    //field bu tepadagi fullName propertyni ozida saqlaydi

    //biz yana override qila olamiz set orqali
    set(value) {
       if(value.startsWith("Jon")){
           field  = "Jon Doe"
       }else{
           field = value
       }
    }
}
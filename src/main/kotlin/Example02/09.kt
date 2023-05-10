package Example02

fun main(){
    doWork2(32, "Alli" ,false)
    doWork2(30,"Oybek",true)

    doWork2(71,"Jon",true)
}
fun doWork2(age:Int, name:String, isHappy:Boolean) {
    if (age < 21){
        println("$name, you are not old enough, you are $age")
    }else{
        println("$name, far tool old at the ripe age of $age")
    }

    println("You are happy? $isHappy")
}
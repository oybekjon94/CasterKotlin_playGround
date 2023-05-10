package Example01

fun main(){
    var calories = 1400
    if (calories > 2000){
        println("You've consumed all your calories for the day")
    }else if (calories > 1500){
        println("You have a few more calories left to eat")
    }else if (calories > 1200){
        println("You have some room for snacks")
    }else{
        println("You still have some calories left")
    }
}
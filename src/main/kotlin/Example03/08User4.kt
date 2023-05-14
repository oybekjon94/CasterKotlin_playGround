package Example03

fun main(){
    println(FavoriteFood.name)
    FavoriteFood.name = "Watermelon"
    println(FavoriteFood.name)

    FavoriteFood.ingredients.add("Salt")
    println(FavoriteFood.ingredients.first())

    doStuff()

    println(FavoriteFood.name)
    println(FavoriteFood.ingredients.firstOrNull())

    println(FavoriteFood.numberOfIngredients())

    println(FavoriteFood == FavoriteFood)


}
fun doStuff(){
    FavoriteFood.name = "Chicken"
    FavoriteFood.ingredients.clear()
}
object FavoriteFood {
    var name  = "unknown"
    var ingredients = mutableListOf<String>()

    fun numberOfIngredients():Int{
        return ingredients.size
    }
}
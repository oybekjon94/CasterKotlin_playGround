package Example01

fun main(){
    var message:String = "Hello,\nMy name is Oybek.\nHow are you?"
    println(message)

    var message2:String = """
        Hello,
        My name is Oybek,
        How are you?
    """.trimIndent()
    //Detects a common minimal indent of all the input lines, removes
    // it from every line and also removes the first and the last lines
    // if they are blank (notice difference blank vs empty).
    println(message2)

    var message3:String = """
        Hello,
        My name is Sherbek,
        How are you?
    """.replaceIndent("abc-|-")
    //Detects a common minimal indent like it does trimIndent
    // and replaces it with the specified newIndent.
    println(message3)

    var message4:String = """
        Hello,
        My name is Nurbek,
        How are you?
    """.trimMargin(">>>")
    //Trims leading whitespace characters followed by marginPrefix from
    // every line of a source string and removes the first and the last
    // lines if they are blank (notice difference blank vs empty).
    println(message4)
}
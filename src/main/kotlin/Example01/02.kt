package Example01

fun main(){
    val myByte: Byte = 8  // 8-bit signed integer
    val myShort: Short = 16 // 16-bit signed integer
    val myInt: Int = 32 // 32-bit signed integer
    val myLong:Long = 64 // 64-bit signed integer

    //decimals
    val myFloat: Float = 32.00F // 32-bit floating point number
    val myDouble: Double = 64.00 // 64-bit floating point number

    println(myByte.toDouble()::class) // ::class -> bu qaysi type ekanligini aniqlab beradi

    val bigLong: Long = 1_000_000
    println(bigLong)

    val newInt = myInt + 12
    println(newInt)

    val newInt2 = myInt.plus(12)
    println(newInt2)

    val newInt3 = myInt.times(10) //Multiplies this value by the other value.
    println(newInt3)
}
package kick

fun variable() {

    val a: Int = 23
    val b: Long = 123
    val c: Float = 3.4f //F
    val d: Double = 12.3

    println("$a $b $c $d")
//    println("" + a + " " + b + " " + c + " " + d)

    val e: Int
    e = a

    println(e)


}

fun main() {
    variable()
}
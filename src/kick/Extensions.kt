package kick

fun main() {
    val name = "Arbaz"

    println(name.charAt())

    val arr = intArrayOf(1, 34, 5, 4, 4, 2, 3, 4)
    arr.swap()

    arr.forEach {
        print("$it\t")
    }

    println()

    println("Pirwani" - "Arbaz")

}

fun IntArray.swap() {
    val temp = this[0]
    this[0] = this[this.size - 1]
    this[this.size - 1] = temp

}

fun String.charAt(): Char {
    return this[0]
}

/*infix fun String.kotlin.minus(s: String): String {
    return "$s $this"
}*/
operator fun String.minus(s: String): String {
    return "$s $this"
}

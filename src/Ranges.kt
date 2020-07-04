fun ranges() {

    val a = 1.rangeTo(10)

    for (i in a) print("$i\t")

    println()

    for (i in 10..20) print("$i\t")

    println()

    for (i in 10 downTo  1) print("$i\t")

    println()

}

fun main() {
    ranges()
}
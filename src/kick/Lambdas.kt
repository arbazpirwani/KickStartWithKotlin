package kick

fun main() {

    val double = { e: Int -> e * 2 }
    listOf(1, 2, 3, 4, 5, 6)
        .filter { e -> e % 2 == 0 }
        .map(double)
        .forEach {
            println(it)
        }

    val lamb1 = { x: Int, y: Int -> x > y }


    val lamb2: (Int, Int) -> Boolean = { x, y -> x > y }


    fun higherOrderFunction(function: (Int, Int) -> Boolean) {
        function(3, 4)
    }

    higherOrderFunction(lamb1)
    higherOrderFunction(lamb2)

    fun toPass(x: Int, y: Int): Boolean {
        return x > y
    }

    higherOrderFunction(::toPass)
}
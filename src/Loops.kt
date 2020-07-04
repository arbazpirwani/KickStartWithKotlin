fun main() {

    var isContinue = true
    while (isContinue) {
        println("in while block")
        isContinue = false
    }

    do {
        println("in do while block")
    } while (isContinue)

    // for(int i = 0;i<10;i++)

    for (i in 10 downTo 0 step 2) {
        print("$i \t")
    }
    println()

    for (i in 0..10) {
        print("$i \t")
    }
    println()

    for (i in 0..10 step 2) {
        print("$i \t")
    }
    println()


    val str = "mynameisarbaz"

    for (c in str) {
        print("$c \t")
    }

    println()
    val arr = arrayOf("one", "two", "three")

    for (value in arr) {
        print("$value\t")
    }
    println()
    for (i in 0 until 10) {
        print("$i \t")
    }
    println()
}
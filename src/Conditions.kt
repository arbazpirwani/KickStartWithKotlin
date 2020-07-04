fun checkTemperature(temp: Int) {


    // ? :
    /*val feel = if(temp <10){
        "cold"
    }else if(temp >20){
        "warm"
    }else{
        "ok"
    }*/

    val feel = when {
        temp < 10 -> "cold"
        temp > 20 -> "warm"
        else -> "ok"
    }

//    println("it feels $feel outside")
    println("it feels ${if (temp > 20) "warm" else "ok"} outside")

}

fun main() {
    checkTemperature(20)
}
package kick

fun nullAbility(arg: String?) {

    println(arg?.substring(2)?.length)
    println(arg!!.substring(2).length)//please don't use double bang

}

fun main() {
    nullAbility("test")
}
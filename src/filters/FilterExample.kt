package filters

fun main() {
    eagarExample()
}

fun eagarExample() {


    val spices = listOf("curry", "pepper", "cayenne",
        "ginger", "red curry", "green curry", "red pepper" )
/*    val eagar = list.filter { it[0] == 'p' }
    println(eagar)
    val seq = list.asSequence().filter { it[0] == 'h' }
    println(seq)
    println(seq.toList())
    val map = list.asSequence().map { println("map: $it") }
    //println(map)

 */

    val curreyHolder =spices.filter { curryFinder(it) }.sortedBy { it.length }
    println("Words Contains Curry  : ${curreyHolder.toList()}")

    val startWithCAndEndInE = spices.filter { finderStartWithCAndEndInE(it) }
    println("Start with C And Ends with E :  $startWithCAndEndInE")

    val threeElementWhichStartWithC = spices.filter { findThreeElementWhichStartWithC(it) }
    println("Words Start with C : $threeElementWhichStartWithC")

}

fun findThreeElementWhichStartWithC(it: String): Boolean {
    return it.take(3).startsWith("c")
}

fun finderStartWithCAndEndInE(it: String): Boolean {
    return  it.startsWith('c') && it.endsWith("e")
    }

fun curryFinder(it: String): Boolean {
    return it.contains("curry")
}

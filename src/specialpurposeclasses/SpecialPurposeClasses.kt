package specialpurposeclasses


//create only one instance
object MobyDickWhale {
    val author: String = "Herman Melville"

    fun jump() {
        println("$author Jumping ....")
    }
}

//create only one instance(object and one property of each)
// plus it did not allow modification
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}

sealed class Seal {
    open fun seal() {
        println("sealed")
    }
}

class SeaLion : Seal() {
    override fun seal() {
        println("Sea Lion")
    }

    override fun equals(other: Any?): Boolean {
        return this === other
    }

    override fun hashCode(): Int {
        return System.identityHashCode(this)
    }
}

class Walrus : Seal() {
    override fun equals(other: Any?): Boolean {
        return this === other
    }

    override fun hashCode(): Int {
        return System.identityHashCode(this)
    }
}

fun matchSeal(seal: Seal): String {

    when (seal) {
        is SeaLion -> "Sea Lion"
        is Walrus -> "Walrus"
    }
    return "no match found"
}

fun main() {
    val moby = MobyDickWhale
    println("author: ${moby.author} & ${moby.jump()}")

    val color = Color.BLUE
    println("color: $color")


    println("seal ${matchSeal(SeaLion())}")


}
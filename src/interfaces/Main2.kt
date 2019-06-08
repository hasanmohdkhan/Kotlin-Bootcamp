package interfaces

fun main() {

    delegate()
}

fun delegate() {
    val placotomus = Plecostomus()
    println("Plecostomus - has Color : ${placotomus.color}")
    placotomus.eat()

}

class Plecostomus(fishcolor: FishColor2 = GoldenColor) :
    FishAction2 by PrintingFishAction("Eats algae..")
    , FishColor2 by GoldenColor

interface FishAction2 {
    fun eat()
}

interface FishColor2 {
    val color: String
}

// for single object
object GoldenColor : FishColor2 {
    override val color: String
        get() = "Gold"
}

// for multiple object creation
class PrintingFishAction(private val food: String) : FishAction2 {
    override fun eat() {
        println(food)
    }
}

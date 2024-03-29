package classes

fun main() {
    callAquarium()
}

fun callAquarium() {
    val aquarium = Aquarium(width = 30, height = 20, length = 30)
    println("h: ${aquarium.height} w: ${aquarium.width}  l: ${aquarium.length} ")
    println("Volume ${aquarium.volume} liters")

    aquarium.length = 90

    println("l: ${aquarium.length} cm")
    println("Volume ${aquarium.volume} liters")


    val aquarium2 = Aquarium(numberOfFish = 9)
    println(
        "Aquarium 2  ${aquarium2.volume} liters with " +
                "length ${aquarium2.length} " +
                "height ${aquarium2.height} " +
                "width ${aquarium2.width} "
    )

    println("_______________________________________")



    val spiciness = SimpleSpice()
    println("spices name: ${spiciness.nameOfSpice} - heat: ${spiciness.heat}")

    spiciness.spiciness = "hot"
    spiciness.nameOfSpice = "green curry"

    println("spices name: ${spiciness.nameOfSpice} - heat: ${spiciness.heat}")

    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )
    println("spices : $spices1")

    val spice = Spice("cayenne", spiciness = "spicy")
    println("spices heat: ${spice.heat}")

    val spicelist = spices1.filter { it.heat < 5 }
    println("spices  list : $spicelist")

    fun makeSalt() = Spice("Salt")
    println("spices : ${makeSalt().heat}")


}

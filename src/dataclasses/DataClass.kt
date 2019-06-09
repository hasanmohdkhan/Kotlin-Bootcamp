package dataclasses

import spices.Curry

fun main() {
    makeDecoration()
}

fun makeDecoration() {
    val d1 = Decorations("Graphite")
    println(d1)

    val d2 = DecorationType("Slate", "normal wood log", "no")
    println(d2)
    println(d2.equals(d1))
    println(d1.equals(d1))

    //Decomposition here
    val (rock, wood, diver) = d2
    println(rock)
    println(wood)
    println(diver)

    val container = listOf(
        SpiceContainer(Curry("Black pepper", "high"))
        , SpiceContainer(Curry("Cardamom", "low")), SpiceContainer(Curry("Clove", "Mild"))
    )
    for (element in container) println("${element.label} & ${element.spiciness}")

}

data class Decorations(val rockType: String)
data class DecorationType(val rockType: String, val wood: String, val diver: String)
data class SpiceContainer(val spice: Curry) {
    val label = spice.name
    val spiciness = spice.spiciness
}
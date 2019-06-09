package spices

fun main() {
    makeCurry()
}

fun makeCurry() {
    var curry = Curry("Red chilli", "Hot")

    println("Curry: ${curry.name} & ${curry.spiciness} and color ${curry.color}")
    curry.grind()

    curry = Curry("Green Curry", "Mild")
    println("Curry: ${curry.name} & ${curry.spiciness} and color ${curry.color}")
    curry.grind()
}

abstract class Spice(
    var name: String = "Curry",
    var spiciness: String = "mild", color: SpiceColor
) : SpiceColor by YellowSpiceColor {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color),
    Grinder {
    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
        println("$spiciness is grinding")
    }

}

interface Grinder {
    fun grind()

}

interface SpiceColor {
    var color: String
}

object YellowSpiceColor : SpiceColor {
    override var color: String
        get() = "Golden"
        set(value) {}

}
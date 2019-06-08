package classes

fun main() {

    callAquarium()

}

fun callAquarium() {
    val aquarium = Aquarium()
    println("h: ${aquarium.height} w: ${aquarium.width}  l: ${aquarium.length} ")
    println("Volume ${aquarium.volume} liters")

    aquarium.length = 90

    println("l: ${aquarium.length} cm")
    println("Volume ${aquarium.volume} liters")


    val spiciness = SimpleSpice()
    println("Spices name: ${spiciness.nameOfSpice} - heat: ${spiciness.heat}")

    spiciness.spiciness = "hot"
    spiciness.nameOfSpice = "green curry"

    println("Spices name: ${spiciness.nameOfSpice} - heat: ${spiciness.heat}")

}

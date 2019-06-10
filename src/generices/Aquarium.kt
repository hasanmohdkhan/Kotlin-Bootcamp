package generices

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicals() {
        needsProcessed = false
    }
}

class FishStoredWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<T : WaterSupply>(val waterSupply: T) {

    fun addWater() {
        check(!waterSupply.needsProcessed) { "water supply needs processed" }

        println("adding water from $waterSupply")
    }
}

fun genericesExample() {

    val aquarium = Aquarium(FishStoredWater())
    aquarium.waterSupply.needsProcessed
    //println("Tap water: ${aquarium.addWater()}")
    val p = Aquarium(TapWater())
    p.waterSupply.addChemicals()
    println("p: ${p.addWater()}")
}

fun main() {
    genericesExample()
}
package generices.Buildings


open class BaseBuildingMaterial {
    open val numberNeeded: Int = 1
}

class Wood : BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick : BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T : BaseBuildingMaterial>(val buildingMaterial: T) {
    var baseMaterialsNeeded = 100
    var actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {

        println("$actualMaterialsNeeded  ${buildingMaterial::class.simpleName} required !")
    }
}

fun main() {
    Building(Wood()).build()
    Building(Brick()).build()
}
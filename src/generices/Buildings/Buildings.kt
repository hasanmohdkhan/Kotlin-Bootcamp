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

// generic function
fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("Large building")

}

fun main() {
    Building(Wood()).build()
    isSmallBuilding(Building(Wood()))
    Building(Brick()).build()
    isSmallBuilding(Building(Brick()))

    //label
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 10)
                println("j $j")
            break@loop
        }

    }

}
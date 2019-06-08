package interfaces

abstract class AquariumFish {
    abstract val color: String
}

class Shark : AquariumFish(), FishAction {
    override val color = "grey"
    override fun eat() {
        println("Hunt smaller fish...")
    }
}

class GoldFish : AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("Eats bread,algae..")
    }
}

interface FishAction {
    fun eat()
}
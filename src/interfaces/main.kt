package interfaces

fun main() {

    val shark = Shark()
    val gold = GoldFish()

    println("Shark  : ${shark.color}  & gold-Fish ${gold.color} ")

    fishFinder(shark)
    fishFinder(gold)

}

fun fishFinder(fish: FishAction) {
    fish.eat()
}
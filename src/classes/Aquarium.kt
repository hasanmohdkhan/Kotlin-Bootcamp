package classes


class Aquarium(var width: Int = 20, var height: Int = 30, var length: Int = 40) {

    var volume: Int
        get() = (width * height * length) / 1000
        set(value) {
            height = (value * 1000) / (width * height)
        }

    constructor(numberOfFish: Int) : this() {
        val water: Int = numberOfFish * 2000 //cm3
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()

    }
}
package classes

class Aquarium {
    var width: Int = 20
    var height: Int = 30
    var length: Int = 40


    var volume: Int
        get() = (width * height * length) / 1000
        set(value) {
            height = (value * 1000) / (width * height)
        }


}
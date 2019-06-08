package lambdas

import java.lang.Math.random
import java.util.*

fun main() {

    val dirty = 20
    val filter = { dirty: Int -> dirty / 4 } // lambdas
    println(filter(dirty))


    val random1 = random()
    val random2 = { random() }

    //println("R1 $random1 & R2 $random2")


    val rollADice = { Random().nextInt(12) + 1 }
    println("Roll a dice : " + rollADice())

    val rollDice = { side: Int -> Random().nextInt(side) + 1 }
    println("roll dice ${rollDice(6)}")

    val rollAdice0 = { side: Int ->
        if (side == 0) 0 else Random().nextInt(side) + 1
    }
    println("Roll a dice 0: ${rollAdice0(0)}")
    println("Roll a dice 0: ${rollAdice0(6)}")


    val rollAdice1: (Int) -> Int = { side ->
        if (side == 0) 0 else Random().nextInt(side) + 1
    }
    println("Roll a dice 1: ${rollAdice1(0)}")
    println("Roll a dice 1: ${rollAdice1(5)}")

    playAGame(rollAdice1(4))

}

fun playAGame(rollAdice1: Int) {
    println("Play Game: $rollAdice1")
}


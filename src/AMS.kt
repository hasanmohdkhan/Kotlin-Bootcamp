import sun.security.util.Length

fun main() {
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(
    capacity: Double,
    numberOfFish: List<Int>,
    newFishLength: Int = 2,
    hasDecorations: Boolean = true
) : Boolean

{
   return (capacity * if(hasDecorations) 0.8 else 1.0) >= numberOfFish.sum()+newFishLength
}





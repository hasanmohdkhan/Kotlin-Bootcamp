package highOrderFunction

enum class Directions {
    EAST, WEST, NORTH, SOUTH, START, END
}

class Game {
    var path = mutableListOf(Directions.START)
    var north = { path.add(Directions.NORTH) }
    var east = { path.add(Directions.EAST) }
    var south = { path.add(Directions.SOUTH) }
    var west = { path.add(Directions.WEST) }
    var end = {
        path.add(Directions.END)
        println("GAME OVER : $path")
        path.clear(); false
    }

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(cmd: String?) {
        if (cmd!!.contains('n')) move(north)
        else if (cmd.contains('w')) move(west)
        else if (cmd.contains('e')) move(east)
        else if (cmd.contains('s')) move(south)
        else move(end)
    }


}

fun main() {
    val game = Game()
//    println(game.path)
//    game.north()
//    game.east()
//    game.south()
//    game.west()
//    game.end()
//    println(game.path)
    println(game.path)
    while (true) {
        print("Enter a direction: n/s/e/w:")
        val input = readLine()
        game.makeMove(input)
        println(game.path)
    }


}









package kotlinEssentials

fun main() {

    val book = Books("Harry Potter", "J.K rollings", 2000)
    println(book.returnTitleAndAuthor())
    println()
    println(book.returnFullDetails())

    println()
    println(
        "I am reading ${book.returnFullDetails().first} " +
                "written by ${book.returnFullDetails().second}"
    )

    println()
    println(
        "I am reading ${book.returnTitleAndAuthor().first} written " +
                "in ${book.returnFullDetails().third}"
    )

}

class Books(var title: String, var author: String, var year: Int) {

    fun returnTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun returnFullDetails(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

}

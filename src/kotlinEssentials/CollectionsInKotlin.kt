package kotlinEssentials

const val MAX_NO_OF_BOOK = 10

object Constants {
    const val BASE_URL = "https://www.thebook.com/"
}

fun main() {

    val allBooks = setOf(
        "The Story of Gulliver",
        "All's Well That Ends Well",
        "Antony and Cleopatra",
        "As You Like It",
        "The Comedy of Errors",
        "Coriolanus",
        "Cymbeline",
        "Hamlet"
    )
    for (element in allBooks) {
        val library = mapOf("Shakespeare" to element)
        println("library $library")
    }


    val library = mapOf("Shakespeare" to allBooks)
    println()
    println(library)
    println("contains Hamlet: ${library.any { it.value.contains("Hamlet") }}")

    println()

    val moreBooks = mutableMapOf(
        "Harry potter" to "J.k rollings",
        "Mockingjay" to "anne"
    )
    moreBooks.getOrPut("jungle book") { "Kipping" }
    moreBooks.getOrPut("Before You") { "unknown" }
    println("more books :\n $moreBooks ")

    println()

    val book = Book(20)
    println("can borrow : ${book.canBorrow()}")
    println()
    val bookName = "harry_potter"
    println("url : ${book.printUrl(bookName)}")


}

class Book(private val currentNoOfBook: Int) {
    var pages: Int = 200

    companion object {
        val BASE_URL = "https://www.thebook.com/"
    }


    fun canBorrow(): Boolean {
        return if (currentNoOfBook == MAX_NO_OF_BOOK) {
            return true
        } else {
            false
        }
    }

    fun printUrl(bookName: String): String {
        return "${Constants.BASE_URL}$bookName.html"
    }

}

package kotlinEssentials

import java.util.*

fun main() {

    val book = Books("Harry Potter", "J.K rollings", 2000, 200)
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

    val books = Books(title = "DBMS", author = "A.K", year = 2010, pages = 300)
    println("Weight: " + books.getWeight())

    println("torn pages: " + books.tornPages(Random().nextInt(12)))

    val puppy = Puppy()
    val book2 = Books("Oliver Twist", "Charles Dickens", 1837, 540)

    while (book2.pages > 0) {
        puppy.playWithBook(book2)
        println("${book2.pages} left in ${book2.title}")
    }
    println("Sad puppy, no more pages in ${book2.title}.")

}

class Books(var title: String, var author: String, var year: Int, var pages: Int) {
    var page: Int = pages

    fun returnTitleAndAuthor(): Pair<String, String> {
        return Pair(title, author)
    }

    fun returnFullDetails(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }

}

fun Books.getWeight(): Double {
    return page * 1.5
}
//fun Books.tornPages(torn :Int) = if(pages >= torn) pages -= torn else pages = 0

fun Books.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

class Puppy {
    fun playWithBook(book: Books) {
        book.tornPages(Random().nextInt(12))
    }
}
fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = lesson_2.getFortune(lesson_2.getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortune(birthday: Int): String {

    val fortune = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    val index = when(birthday){
        in 28..31 -> 4
        in 1..7 -> 2
        else -> birthday.rem(fortune.size)
    }


    return  fortune[index]

}

fun getBirthday(): Int {
    print("Enter birthday : ")
    return readLine()?.toIntOrNull() ?:1
}




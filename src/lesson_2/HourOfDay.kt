package lesson_2

fun main() {
    println(whatShouldIDoToday("happy"))
    println(whatShouldIDoToday("sad"))
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24


): String {
    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
       // isMoodAndWeather("happy","")
        mood == "sad" && weather == "Sunny" -> "Sleep"
        mood == "sad" && weather == "rainy" && temperature == 0 -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }
}

fun isMoodAndWeather(mood: String, weather: String) = if( mood == "happy" && weather == "Sunny") { "go for a walk"} else "ni"






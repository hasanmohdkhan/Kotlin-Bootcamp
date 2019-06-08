package classes

/*
1- Create class, SimpleSpice.
2- Let the class be a property with a String for the name of the spice,
   and a String for the level of spiciness.

3- Set the name to curry and the spiciness to mild.
4- Using a string for spiciness is nice for users, but not useful for calculations.
   Add a heat property to your class with a getter that returns a numeric value for spiciness.
   Use a value of 5 for mild.
5- Create an instance of SimpleSpice and print out its name and heat.
* */

class SimpleSpice {
    var nameOfSpice: String = "curry"
    var spiciness: String = "mild"

    val heat: Int
        get() {
            return if (spiciness == "mild") {
                5
            } else 1
        }

}
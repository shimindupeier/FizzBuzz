fun fizzBuzz(startInt: Int, endInt: Int): String {

    if (startInt < 0 || endInt < 0) return "Please only enter positive integer"
    else if (startInt > endInt) return "Start int must be smaller than end int"

    return ((startInt..endInt).map {
        when {
            it.rem(3) == 0 && it.rem(5) == 0 -> "fizzbuzz"
            it.rem(3) == 0 -> "fizz"
            it.rem(5) == 0 -> "buzz"
            else -> it.toString()
        }
    }).joinToString(", ")
}
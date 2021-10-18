fun fizzBuzz(startInt: Int, endInt: Int): String {

    if (startInt < 0 || endInt < 0) return "Please only enter positive integer"
    else if (startInt > endInt) return "Start int must be smaller than end int"

    return ((startInt..endInt).map {
        when {
            startInt == 0 -> "0"
            hasRem(3, it) && hasRem(5, it) -> "fizzbuzz"
            hasRem(3, it) -> "fizz"
            hasRem(5, it) -> "buzz"
            else -> it.toString()
        }
    }).joinToString(", ")
}

fun hasRem(divisor: Int, dividend: Int) = dividend.rem(divisor) == 0
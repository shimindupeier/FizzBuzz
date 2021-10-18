fun fizzBuzz(startInt: Int, endInt: Int): String {

    if (startInt < 0 || endInt < 0)
        return "Please only enter positive integer"
    else if (startInt > endInt)
        return "Start int must be smaller than end int"
    val numList = (startInt..endInt)
    val output = mutableListOf<String>()
    numList.forEach { when {
        it.rem(3) == 0 && it.rem(5) != 0 -> output.add("fizz")
        it.rem(3) != 0 && it.rem(5) == 0 -> output.add("buzz")
        it.rem(3) == 0 && it.rem(5) == 0 -> output.add("fizzbuzz")
        else -> output.add(it.toString())
    } }

    return output.joinToString(", ")
}
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class FizzBuzzKtTest {

    @Test
    fun fizzBuzzTestRangeOneToThreeExpectedString() {
        val expected = "1, 2, fizz"
        val result = fizzBuzz(1, 3)
        assertEquals(expected, result)
    }

    @Test
    fun fizzBuzzTestRangeOneToFifteenExpectedString() {
        val expected = "1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz"
        val result = fizzBuzz(1, 15)
        assertEquals(expected, result)
    }

    @Test
    fun fizzBuzzTestRangeThreeToFifteenExpectedString() {
        val expected = "fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz"
        val result = fizzBuzz(3, 15)
        assertEquals(expected, result)
    }

    @Test
    fun fizzbuzzTestNegativeStartIntReturnErrorMessage() {
        val expected = "Please only enter positive integer"
        val result = fizzBuzz(-1, 3)
        assertEquals(expected, result)

    }

    @Test
    fun fizzbuzzTestNegativeEndIntReturnErrorMessage() {
        val expected = "Please only enter positive integer"
        val result = fizzBuzz(1, -3)
        assertEquals(expected, result)
    }

    @Test
    fun fizzbuzzTestNegativeStartIntAndEndIntReturnErrorMessage() {
        val expected = "Please only enter positive integer"
        val result = fizzBuzz(-5, -15)
        assertEquals(expected, result)
    }

    @Test
    fun fizzBuzzStartIntSmallerThanEndItReturnErrorMessage() {
        val expected = "Start int must be smaller than end int"
        val result = fizzBuzz(10, 1)
        assertEquals(expected, result)
    }

    @Test
    fun fizzBuzzStartIntEqualEndInt() {
        val expected = "fizz"
        val result = fizzBuzz(3, 3)
        assertEquals(expected, result)
    }

    @Test
    fun fizzBuzzStartIntEqualEndInt2() {
        val expected = "4"
        val result = fizzBuzz(4, 4)
        assertEquals(expected, result)
    }

    @Test
    fun fizzBuzzTestZeroValue() {
        val expected = "0"
        val result = fizzBuzz(0, 0)
        assertEquals(expected, result)
    }

    @Test
    fun fizzBuzzTestZerotoThree() {
        val expected = "0, 1, 2, fizz"
        val result = fizzBuzz(0, 3)
        assertEquals(expected, result)
    }
}
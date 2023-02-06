import org.junit.jupiter.api.*

class CalculateSquareOddNumbersKtTest {

    @Test
    fun squareOfZero() {
        val expected = 0
        Assertions.assertEquals(expected, squareOf(0))
    }

    @Test
    fun squareOfPositiveNumber() {
        val expected = 16
        Assertions.assertEquals(expected, squareOf(4))
    }

    @Test
    fun squareOfNegativeNumber() {
        val expected = 16
        Assertions.assertEquals(expected, squareOf(-4))
    }
}
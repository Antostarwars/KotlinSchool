import org.junit.jupiter.api.*
import kotlin.math.exp

class PrimeNumberKtTest {

    @Test
    fun isPrime() {
        val expected = true
        Assertions.assertEquals(expected, primeNumber(17))
    }

    @Test
    fun isNotPrime() {
        val expected = false
        Assertions.assertEquals(expected, primeNumber(18))
    }

    @Test
    fun cannotHaveNegativeNumber() {
        assertThrows<IllegalArgumentException>{primeNumber(0)}
    }
}
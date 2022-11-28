import org.junit.jupiter.api.*
import java.lang.IllegalArgumentException

internal class BmiMetricKtTest {

    @Test
    fun cannotHaveWeightNegative() {
        assertThrows<IllegalArgumentException> { bmiMetric(0.0,1.6) }
    }

    @Test
    fun cannotHaveHeightNegative() {
        assertThrows<IllegalArgumentException> { bmiMetric(70.0,0.0) }
    }

    @Test
    fun cannotHaveHeightAndWeightNegative() {
        assertThrows<IllegalArgumentException> { bmiMetric(0.0,0.0) }
    }

    @Test
    fun isUnderweight() {
        val expected = "Underweight"
        Assertions.assertEquals( expected, bmiMetric(47.36,1.6))
    }

    @Test
    fun isMinimumNormalweight() {
        val expected = "Normalweight"
        Assertions.assertEquals( expected, bmiMetric(47.37,1.6))
    }

    @Test
    fun isMaximumNormalweight() {
        val expected = "Normalweight"
        Assertions.assertEquals( expected, bmiMetric(64.0,1.6))
    }

    @Test
    fun isOverweight() {
        val expected = "Overweight"
        Assertions.assertEquals( expected, bmiMetric(64.1,1.6))
    }
}
import org.junit.jupiter.api.*

internal class MatrixTest {

    @Test
    fun init_lengthCannotBeZero() {
        assertThrows<IllegalArgumentException>{ Matrix(0, 2) }
    }

    @Test
    fun init_heightCannotBeZero() {
        assertThrows<IllegalArgumentException>{ Matrix(2, 0) }
    }
}
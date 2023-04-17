import org.junit.jupiter.api.*
internal class StackTest {

    @Test
    fun checkIfItsEmptyAtTheStart() {
        val stack = Stack(5, arrayOf())
        val expected = true
        Assertions.assertEquals(expected, stack.isEmpty())
    }

    @Test
    fun addAnElementToTheStack() {
        val stack = Stack(5, arrayOf())
        stack.push(1)
        val expected = 1
        Assertions.assertEquals(expected, stack.stack[0])
    }

    @Test
    fun StackIsFullAndCannotAddAnElement() {
        val stack = Stack(1, arrayOf())
        stack.push(1)
        stack.push(2)
        assertThrows<IllegalArgumentException> { stack.push(3) }
    }
}
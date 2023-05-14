import org.junit.jupiter.api.*

internal class StringVerificaTest {
    @Test
    fun equalsTo_StringsAreDifferent() {
        val string = StringVerifica(arrayOf('c','i','a','o'))
        val expected = false
        Assertions.assertEquals(expected, string.equalsTo(StringVerifica(arrayOf('c','a','c','a', 'a'))))
    }
    @Test
    fun equalsTo_StringsAreEquals() {
        val string = StringVerifica(arrayOf('c','i','a','o'))
        val string2 = StringVerifica(arrayOf('c','i','a','o'))
        val expected = true
        Assertions.assertEquals(expected, string.equalsTo(string2))
    }
}
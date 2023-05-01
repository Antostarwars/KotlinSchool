import org.junit.jupiter.api.*

internal class StringClassTest {
    @Test
    fun twoStringClassAreEqual(){
        val stringClassFirst = StringClass(arrayOf('2','t','b','a','b'))
        val stringSecond = "2tbab"
        val expected = true
        Assertions.assertEquals(expected, stringClassFirst.equalsTo(stringSecond))
    }
    @Test
    fun twoStringClassAreNotEqual(){
        val stringClassFirst = StringClass(arrayOf('2','t','b','a','b'))
        val stringSecond = "sus"
        val expected = false
        Assertions.assertEquals(expected, stringClassFirst.equalsTo(stringSecond))
    }
    @Test
    fun twoStringClassWithDifferentLengthAreNotEqual(){
        val stringClassFirst = StringClass(arrayOf('2','t','b','a','b'))
        val stringSecond = "2tbabtut"
        val expected = false
        Assertions.assertEquals(expected, stringClassFirst.equalsTo(stringSecond))
    }
    @Test
    fun trimWorksCorrectly(){
        val stringClass = StringClass(arrayOf(' ', ' ', 'f', ' ', 'f', ' ', ' '))
        val newStringClass = StringClass(stringClass.trim())
        val stringExpected = "f f"
        val expected = true
        Assertions.assertEquals(expected, newStringClass.equalsTo(stringExpected))
    }
    @Test
    fun trimWithNoSpacesDoNothing(){
        val stringClass = StringClass(arrayOf('8', '5', 'f', 'r', 'f', 'f', '2'))
        val newStringClass = StringClass(stringClass.trim())
        val stringExpected = "85frff2"
        val expected = true
        Assertions.assertEquals(expected, newStringClass.equalsTo(stringExpected))
    }
    @Test
    fun stringToIntIsCorrect(){
        val stringClass = StringClass(arrayOf('5','4','4','3'))
        val integer = stringClass.toInt()
        val expected = 5443
        Assertions.assertEquals(expected, integer)
    }
    @Test
    fun toIntCannotConvertNotIntegerChars(){
        val stringClass = StringClass(arrayOf('f','4','2','4'))
        assertThrows<IllegalStateException> { stringClass.toInt() }
    }
}
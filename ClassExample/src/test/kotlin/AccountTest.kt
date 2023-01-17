import org.junit.jupiter.api.*
import java.lang.IllegalArgumentException


class AccountTest {

    @Test
    fun whenCreateAnAccountTheBalanceIsZero() {
        val account = Account()
        val expected = 0.0
        Assertions.assertEquals(expected, account.balance)
    }

    @Test
    fun whenCreateAnAccountTheNameIsEmptyString() {
        val account = Account()
        val expected = ""
        Assertions.assertEquals(expected, account.name)
    }

    @Test
    fun canNotHaveNegativeBalance() {
        val account = Account()
        assertThrows<IllegalArgumentException> {account.balance = -Double.MAX_VALUE-1.0}
    }

    @Test
    fun whenSetTheNameToPippoThenTheNameIsPippo() {
        val account = Account()
        account.name = "Pippo"
        val expected = "Pippo"
        Assertions.assertEquals(expected,account.name)
    }

    @Test
    fun whenSetTheBalanceTo100EurosThenTheBalanceIs100Euros() {
        val account = Account()
        account.balance = 100.0
        val expected = 100.0
        Assertions.assertEquals(expected, account.balance)
    }
}
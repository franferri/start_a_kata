package example

import org.junit.Assert.assertEquals
import org.junit.Test

class BankAccountKotlinShould {

    @Test
    fun `have balance of zero when created`() {

        val bankAccount = BankAccountKotlin()

        assertEquals(bankAccount.balance(), 0)

    }

    @Test
    fun `have the balance increased after a deposit`() {

        // given
        val bankAccount = BankAccountKotlin()

        // when
        bankAccount.deposit(10)

        // then
        assertEquals(bankAccount.balance(), 10)

    }

}

package example

import org.junit.Assert.assertEquals
import org.junit.Test

class BankAccountKotlinMixedShould {

    @Test
    fun `have balance of zero when created kotlin`() {

        val bankAccount = BankAccountKotlin()

        assertEquals(bankAccount.balance(), 0)

    }

    @Test
    fun `have the balance increased after a deposit kotlin`() {

        // given
        val bankAccount = BankAccountKotlin()

        // when
        bankAccount.deposit(10)

        // then
        assertEquals(bankAccount.balance(), 10)

    }

    @Test
    fun `have balance of zero when created java`() {

        val bankAccount = BankAccountJava()

        assertEquals(bankAccount.balance(), 0)

    }

    @Test
    fun `have the balance increased after a deposit java`() {

        // given
        val bankAccount = BankAccountJava()

        // when
        bankAccount.deposit(10)

        // then
        assertEquals(bankAccount.balance(), 10)

    }

}

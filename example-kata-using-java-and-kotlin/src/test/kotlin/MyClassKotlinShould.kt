import example.BankAccountKotlin
import io.mockk.every
import io.mockk.mockkClass
import io.mockk.mockkObject
import io.mockk.verify
import org.junit.Test
import kotlin.test.assertEquals

class MyClassKotlinShould {

    @Test
    fun do_something_interesting() {

        val bankAccount = BankAccountKotlin()

        bankAccount.deposit(10000)

        mockkObject(bankAccount)
        every { bankAccount.balance() } returns 99

        assertEquals(99, bankAccount.balance())

        verify { bankAccount.balance() }

    }


    @Test
    fun do_something_interestingish() {

        val bankAccount = BankAccountKotlin()

        mockkObject(bankAccount)
        every { bankAccount.balance() } returns 99

        bankAccount.depositAndBalance(10000)

        assertEquals(99, bankAccount.depositAndBalance(10000))

        verify { bankAccount.balance() }

    }

    @Test
    fun do_something_interestingisher() {

        val bankAccount = mockkClass(BankAccountKotlin::class)

        mockkObject(bankAccount)
        every { bankAccount.balance() } returns 99

        assertEquals(99, bankAccount.depositAndBalance(10000))

        verify { bankAccount.balance() }

    }

}

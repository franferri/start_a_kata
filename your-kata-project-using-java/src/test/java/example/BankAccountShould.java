package example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankAccountShould {

    @Test
    public void have_balance_of_zero_when_created() {

        // given
        BankAccount bankAccount = new BankAccount();

        // then
        assertEquals(0, bankAccount.balance());

    }

    @Test
    public void have_the_balance_increased_after_a_deposit() {

        // given
        BankAccount bankAccount = new BankAccount();

        // when
        bankAccount.deposit(10);

        // then
        assertEquals(10, bankAccount.balance());

    }

}

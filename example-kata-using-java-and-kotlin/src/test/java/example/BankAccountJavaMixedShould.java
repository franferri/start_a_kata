package example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountJavaMixedShould {

    @Test
    public void have_balance_of_zero_when_created_java() {

        BankAccountJava bankAccount = new BankAccountJava();

        assertEquals(bankAccount.balance(), 0);

    }

    @Test
    public void have_the_balance_increased_after_a_deposit_java() {

        // given
        BankAccountJava bankAccount = new BankAccountJava();

        // when
        bankAccount.deposit(10);

        // then
        assertEquals(bankAccount.balance(), 10);

    }

    @Test
    public void have_balance_of_zero_when_created_kotlin() {

        BankAccountKotlin bankAccount = new BankAccountKotlin();

        assertEquals(bankAccount.balance(), 0);

    }

    @Test
    public void have_the_balance_increased_after_a_deposit_kotlin() {

        // given
        BankAccountKotlin bankAccount = new BankAccountKotlin();

        // when
        bankAccount.deposit(10);

        // then
        assertEquals(bankAccount.balance(), 10);

    }

}

package example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BankAccountJavaShould {

    @Test
    public void have_balance_of_zero_when_created() {

        BankAccountJava bankAccount = new BankAccountJava();

        assertEquals(bankAccount.balance(), 0);

    }

    @Test
    public void have_the_balance_increased_after_a_deposit() {

        // given
        BankAccountJava bankAccount = new BankAccountJava();

        // when
        bankAccount.deposit(10);

        // then
        assertEquals(bankAccount.balance(), 10);

    }

}

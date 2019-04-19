package example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankAccountShould {

	@Test
	public void have_balance_of_zero_when_created() {

		BankAccount bankAccount = new BankAccount();

		assertEquals(bankAccount.balance(), 0);

	}

	@Test
	public void have_the_balance_increased_after_a_deposit() {

		// given
		BankAccount bankAccount = new BankAccount();

		// when
		bankAccount.deposit(10);

		// then
		assertEquals(bankAccount.balance(), 10);

	}
	
}

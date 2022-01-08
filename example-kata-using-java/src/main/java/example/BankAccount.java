package example;

public class BankAccount {

	int balance = 0;

	public Object balance() {
		return balance;
	}

	public void deposit(int deposit) {
		balance += deposit;
	}

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount();
		bankAccount.deposit(10);
		System.out.println("Your bank account has "+ bankAccount.balance() + " currency");

	}

}

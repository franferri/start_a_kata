package example

class BankAccountKotlin {

    internal var balance = 0

    fun balance(): Any {
        return balance
    }

    fun deposit(deposit: Int) {
        balance += deposit

    }

}

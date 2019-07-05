package example

class BankAccountKotlin {

    internal var balance = 0

    fun balance(): Int {
        return balance
    }

    fun deposit(deposit: Int) {
        balance += deposit

    }

    fun  depositAndBalance(deposit: Int) : Int {

        deposit(deposit)

        return balance()

    }

}

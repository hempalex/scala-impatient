class BankAccount() {
	private var account: Double = 0

	def deposit(value: Double) = {
		account += value
	}

	def withdraw(value: Double) = {
		if (value <= account)
			account -= value
		else
			throw new Exception("Your balance ("+account+") too small for withdraw " + value)
	}

	def balance = account
}

val a = new BankAccount

try {
	a.deposit(100)
	println(a.balance)
	a.withdraw(50)
	println(a.balance)
	a.withdraw(100)
	println(a.balance)
} catch {
	case e: Exception => println(e.getMessage)
}
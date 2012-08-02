class BankAccount(initialBalance: Double) {
	private var _balance = initialBalance
	def deposit(amount: Double) = { _balance += amount; _balance }
	def withdraw(amount: Double) = { _balance -= amount; _balance }
	def balance(): Double = _balance
	override def toString = "Balance = %f".format(balance)
}

class SavingsAccount(
		initialBalance: Double,
		val interestRateYear: Double = 0.10,
		val freeTransactions: Int = 3,
		val comission: Double = 1.0
	) extends BankAccount(initialBalance) {

	var transactionsInMonth: Int = 0

	def isFreeTransaction() = transactionsInMonth <= freeTransactions

	override def deposit(amount: Double) = {
		transactionsInMonth += 1
		super.deposit(amount - (if (isFreeTransaction()) 0 else comission))

	}
	override def withdraw(amount: Double) = {
		transactionsInMonth += 1
		super.withdraw(amount + (if (isFreeTransaction()) 0 else comission))
	}

	def earnMonthlyInterest = {
		transactionsInMonth = 0
		super.deposit(balance() * interestRateYear / 12)
	}
}


val b = new BankAccount(100.0)

println("BankAccount")

b.deposit(100);
println(b)

b.withdraw(100);
println(b)

println("SavingAccount")

val a = new SavingsAccount(100.0, 0.10, 2, 2.0)

a.deposit(100);
println(a)

a.withdraw(100);
println(a)

a.deposit(100);
println(a)

a.withdraw(100);
println(a)

a.earnMonthlyInterest
println("Monthly Interest: " + a)

a.deposit(100);
println(a)

a.withdraw(100);
println(a)


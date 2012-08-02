class BankAccount(initialBalance: Double) {
	private var balance = initialBalance
	def deposit(amount: Double) = { balance += amount; balance }
	def withdraw(amount: Double) = { balance -= amount; balance }
	override def toString = "Balance = %f".format(balance)
}

class CheckedAccount(initialBalance: Double, val comission: Double = 1.0) extends BankAccount(initialBalance) {
	override def deposit(amount: Double) = super.deposit(amount - comission);
	override def withdraw(amount: Double) = super.withdraw(amount + comission);
}


val b = new BankAccount(100.0)

b.deposit(100);
println(b)

b.withdraw(100);
println(b)

val a = new CheckedAccount(100.0, 2.0)

a.deposit(100);
println(a)

a.withdraw(100);
println(a)

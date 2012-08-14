class Money(d: Int, c: Int) {
	val dollars: Int = d + c / 100
	val cents: Int = c % 100
	override def toString() = "%d.%d".format(dollars, cents)

	def ==(that: Money) = this.dollars == that.dollars && this.cents == that.cents
	def +(that: Money) = new Money(this.dollars + that.dollars, this.cents + that.cents)
	def -(that: Money) = {
		val cents = this.dollars * 100 + this.cents - that.dollars * 100 - that.cents
		new Money(cents / 100, cents % 100)
	}
}

object Money {
	def apply(d: Int, c: Int) = new Money(d, c)
}

val x = Money(1, 75)
val y = Money(0, 50)

println(x + y)
println(x - y)


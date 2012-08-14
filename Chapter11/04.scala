class Money(d: BigInt, c: BigInt) extends Ordered[Money]{
	val dollars: BigInt = d + c / 100
	val cents: BigInt = c % 100
	override def toString() = "%d.%d".format(dollars, cents)

	def toCents(): BigInt = dollars * 100 + cents
	def fromCents(cents: BigInt) = new Money(cents / 100, cents % 100)

	override def compare(that: Money):Int = toCents.compare(that.toCents)

	def +(that: Money) = fromCents(this.toCents + that.toCents)
	def -(that: Money) = fromCents(this.toCents - that.toCents)
}

object Money {
	def apply(d: Int, c: Int) = new Money(d, c)
}

val x = Money(1, 75)
val y = Money(0, 50)

println(x + y)
println(x - y)

println(x > y)


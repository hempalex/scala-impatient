class Fraction(n: Int, d: Int) {
	private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
	private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
	override def toString = num + "/" + den
	def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
	def gcd(a: Int, b: Int): Int = if (b == 0) math.abs(a) else gcd(b, a % b)

	def +(that: Fraction) = {
		new Fraction(this.num * that.den + that.num * this.den, this.den * that.den)
	}
	def -(that: Fraction) = {
		new Fraction(this.num * that.den - that.num * this.den, this.den * that.den)
	}

	def *(that: Fraction) = {
		new Fraction(this.num * that.num, this.den * that.den)
	}

	def /(that: Fraction) = {
		new Fraction(this.num * that.den, this.den * that.num)
	}

}

object Fraction {
	def apply(n: Int, d: Int) = new Fraction(n, d)
}

val x = Fraction(1, 4)
val y = Fraction(1, 2)

println(x + y)
println(x - y)
println(x * y)
println(x / y)


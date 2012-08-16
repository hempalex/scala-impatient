class Matrix(val m: Int, val n: Int) {
	
	private val value = Array.ofDim[Double](m, n)

	def update(x: Int, y: Int, v: Double) = value(x)(y) = v
	def apply(x: Int, y: Int) = value(x)(y)

	def +(other: Matrix) = {
		require (n == other.n)
		require (m == other.m)

		var res = new Matrix(m, n)
		for(i <- 0 until m; j <- 0 until n) {
			res(i, j) = this.value(i)(j) + other.value(i)(j)
		}
		res 
	}

	def -(other: Matrix) = this + other * -1



	def *(factor: Double) = {
		var res = new Matrix(m, n)
		for(i <- 0 until m; j <- 0 until n) {
			res(i, j) = this.value(i)(j) * factor
		}
		res 
	}

	private def prod(other: Matrix, i: Int, j: Int) = {
		(for (k <- 0 until n) yield value(i)(k) * other.value(j)(k)).sum
	}

	def *(other: Matrix) = {
		require(n == other.m)
		var res = new Matrix(m, n)
		for(i <- 0 until m; j <- 0 until n) {
			res(i, j) = prod(other, i, j)
		}
		res 
	}
	
	override def toString = value.map(_.mkString(" ")).mkString("\n")
}

val x = new Matrix(2, 2)
x(0, 0) = 1
x(0, 1) = 2
x(1, 0) = 3
x(1, 1) = 4

println(x)
println()
println(x * 2)
println()
println(x * 2 - x)
println()

println((x * 2) * (x * 3))
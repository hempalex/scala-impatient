class Matrix(val m: Int, val n: Int) {
	private val value = Array.ofDim[Double](m, n)

	def update(x: Int, y: Int, v: Double) = value(x)(y) = v
	def apply(x: Int, y: Int) = value(x)(y)

	def *(factor: Double) {
		for(row <- value) yeild (for (col <- row) yield col*factor)
	}

	def *(other: Matrix) {
		require(n == other.m)
	}

	def +(other: Matrix) {
		require (n == other.n)
		require (m == other.m)
	}
}
class BitSequence(private var value: Long = 0) {

	implicit def bool2int(b: Boolean) = if (b) 1 else 0

	def update(bit: Int, state: Int) = value |= (state & 1L) << bit % 64
	def apply(bit: Int): Int = if ((value & 1L << bit % 64) > 0) 1 else 0

	override def toString = "%64s".format(value.toBinaryString).replace(" ", "0")
}


val x = new BitSequence()

x(5) = 1
x(63) = 1
x(64) = 1

println(x(5))

println(x)

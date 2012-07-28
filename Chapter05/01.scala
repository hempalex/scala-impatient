class Counter(private var value: Int = 0) {
	def increment() { if (value < Int.MaxValue) value += 1 }
	def current = value
}

val c = new Counter(Int.MaxValue - 1)

println(c.current)
c.increment()
println(c.current)
c.increment()
println(c.current)

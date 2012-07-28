class Time(h: Int = 0, m: Int = 0) {

	private var mins = h * 60 + m

	def hours = mins / 60
	def minutes = mins % 60

	def before(other: Time) = mins < other.mins

}

val time = new Time(1, 30)

println("Time is: " + time.hours + ":" + time.minutes)

println(time.before(new Time(2, 30)))
println(time.before(new Time(1, 10)))
class Time(private var h: Int = 0, private var m: Int = 0) {

	def hours = h
	def minutes = m

	def before(other: Time) = h * 60 + m < other.h * 60 + other.m

}

val time = new Time(1, 30)

println("Time is: " + time.hours + ":" + time.minutes)

println(time.before(new Time(2, 30)))
println(time.before(new Time(1, 10)))
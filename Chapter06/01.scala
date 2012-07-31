object Conversations {
	def inchesToSantimeters(value: Double) = value * 2.54
	def gallonsToLiters(value: Double) = value * 3.78541178
	def milesToKilometers(value: Double) = value * 1.609344
}

println("%f inch = %f santimeters".format(1.0, Conversations.inchesToSantimeters(1.0)))
println("%f gallon = %f liters".format(1.0, Conversations.gallonsToLiters(1.0)))
println("%f mile = %f kilometers".format(1.0, Conversations.milesToKilometers(1.0)))
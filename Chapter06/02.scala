abstract class UnitConversion {
	def convert(value: Double): Double
}

object InchesToSantimeters extends UnitConversion {
	def convert(value: Double): Double = value * 2.54
}

object GallonsToLiters extends UnitConversion {
	def convert(value: Double): Double = value * 3.78541178
}

object MilesToKilometers extends UnitConversion {
	def convert(value: Double): Double = value * 1.609344
}

println("%f inch = %f santimeters".format(1.0, InchesToSantimeters.convert(1.0)))
println("%f gallon = %f liters".format(1.0, GallonsToLiters.convert(1.0)))
println("%f mile = %f kilometers".format(1.0, MilesToKilometers.convert(1.0)))
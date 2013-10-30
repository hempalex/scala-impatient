val prices = List(5.0, 20.0, 9.95)
val quantities = List(10, 2, 1)

val sum = (prices, quantities).zipped map { _ * _ }

println(sum)
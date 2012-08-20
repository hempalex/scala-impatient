val prices = List(5.0, 20.0, 9.95) 
val quantities = List(10, 2, 1)

val subtotal = ((x: Double, y: Int) => x * y).tupled
val sum = (prices zip quantities) map(subtotal(_))

println(sum)
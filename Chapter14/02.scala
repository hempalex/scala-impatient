def swap(p: Tuple2[Int, Int]) = p match {
	case (y, x) => (x, y)
}

val x = (1, 2)
val y = swap(x)

println(x)
println(y)
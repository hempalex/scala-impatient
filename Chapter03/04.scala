def positiveNegative(a: Array[Int]) = {
	a.filter(_ > 0) ++ a.filter(_ <= 0)
}

val test = Array(10, 7, -5, 11, -44, 0, 22, -22, -100, 77, -5);
val res = positiveNegative(test)

println(test.mkString("Array(", ", ", ")"))
println(res.mkString("Array(", ", ", ")"))
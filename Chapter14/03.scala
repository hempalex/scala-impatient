def swap(a: Array[Int]) = a match {
	case Array(x, y, rest @ _*) => Array(y, x) ++ rest
	case _ => a
}

val x = Array(1, 2, 3, 4)
val y = swap(x)

println(x.mkString(", "))
println(y.mkString(", "))
  
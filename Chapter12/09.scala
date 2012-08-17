def corresponds[A, B](a: Seq[A], b: Seq[B], f: (A, B) => Boolean) = (a zip b).map(x => f(x._1, x._2)).count(!_) == 0

val a = Array("Hello", "beautyful", "world", "!")
val b = a.map(_.length)

println(a.mkString(", "))
println(b.mkString(", "))

val y = corresponds(a, b, (x: String, y: Int) => x.length == y)

println(y)

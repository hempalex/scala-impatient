val a = Array("Hello", "beautyful", "world", "!")
val b = a.map(_.length)

println(a.mkString(", "))
println(b.mkString(", "))

val y = a.corresponds(b)(_.length == _)

println(y)

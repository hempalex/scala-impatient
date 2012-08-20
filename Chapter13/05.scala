def mkString[T](s: Seq[T], sep: String = ", "): String = s.map(_.toString)reduceLeft(_.toString + sep + _.toString)

val a = Array("Tom", "Fred", "Harry") 

println(mkString(a))
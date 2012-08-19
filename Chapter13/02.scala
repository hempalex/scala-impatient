def indexes(s: String) = 
	s.zipWithIndex.groupBy(_._1).map(x => (x._1, x._2.map(_._2).toList))

val x = indexes("Missisipi")
println(x)
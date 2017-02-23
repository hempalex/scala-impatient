
def existIn(a: Array[String], m: Map[String, Int]) = a.flatMap(m.get).toList

val a = Array("Tom", "Fred", "Harry")
val m = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)

val x = existIn(a, m)
println(x)

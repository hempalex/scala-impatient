def arrayDim(a: Array[Int], numOfDim: Int) = a.grouped(numOfDim).toArray.map(_.toArray)

val a = (1 to 9).toArray
val x = arrayDim(a, 3)

println(x.deep.mkString(", "))
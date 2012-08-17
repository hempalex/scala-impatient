def ajustToPair(fun: (Int, Int) => Int) = (x: (Int, Int)) => fun(x._1, x._2)

val x = ajustToPair(_ * _)((6, 7))
println(x)

val pairs = (1 to 10) zip (11 to 20)
println(pairs)

val y = pairs.map(ajustToPair(_ + _))
println(y)

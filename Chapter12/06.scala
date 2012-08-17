def largest(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(x => (x, fun(x))).reduceLeft((x,y) => if (x._2 > y._2) x else y)._1

println(largest(x => 10 * x - x * x, 1 to 10))
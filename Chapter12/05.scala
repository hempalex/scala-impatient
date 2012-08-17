def largest(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(fun(_)).max

println(largest(x => 10 * x - x * x, 1 to 10))
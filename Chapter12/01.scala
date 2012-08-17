def values(fun: (Int) => Int, low: Int, high: Int) = (low to high) map { x => (x, fun(x)) }

val x = values(x => x * x, -5, 5)

println(x)

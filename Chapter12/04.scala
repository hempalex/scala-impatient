def factorial(n: Int) = (1 to n).foldLeft(1)(_ * _)

println(factorial(-3))
println(factorial(5))
def factorial(n: Int) = (1 to n).reduceLeft(_ * _)

println(factorial(3))
println(factorial(5))
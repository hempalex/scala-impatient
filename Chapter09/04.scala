val numbers = io.Source.fromFile("04.txt").mkString.split("""\s+""").map(_.toDouble)

println("Numbers: " + numbers.mkString(", "))

println("Sum: " + numbers.sum)
println("Avg: " + numbers.sum / numbers.length)
println("Min: " + numbers.min)
println("Max: " + numbers.max)
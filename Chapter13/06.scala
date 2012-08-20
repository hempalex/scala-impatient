val lst = List(1, 2, 3, 4, 5)
println(lst)
val x = (lst :\ List[Int]())(_ :: _) // foldLeft
println(x)
val y = (List[Int]() /: lst)(_ :+ _) // foldRight
println(y)
val z = (List[Int]() /: lst)((x,y) => y :: x)
println(z)
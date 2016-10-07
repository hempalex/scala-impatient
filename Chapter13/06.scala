val lst = List(1, 2, 3, 4, 5)
println(lst)
val x = (lst :\ List[Int]())(_ :: _) // foldRight
println(x)
val y = (List[Int]() /: lst)(_ :+ _) // foldLeft
println(y)
val z = (List[Int]() /: lst)((x,y) => y :: x) // reverse list using foldLeft
println(z)
val z2 = (lst :\ List[Int]())((x,y) => y :+ x) // reverse list using foldRight
println(z2)
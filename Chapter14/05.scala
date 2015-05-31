val tree = List(List(3,8), 2, List(5))

def leafSum(n : List[Any]) : Int = n.map(_ match {
  case l : List[Any] => leafSum(l)
  case n : Int => n
}).sum

println(leafSum(tree))

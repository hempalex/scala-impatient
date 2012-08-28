
def sumLeaf(list: List[Any]) : Int = {
	(for(elem <- list) yield ( 
		elem match {
			case x: List[Int] => sumLeaf(x)
			case x: Int => x
			case _ => 0
		}
	)).sum
}

val x = List(List(3, 8), 2, List(5))

println(x)
println(sumLeaf(x))
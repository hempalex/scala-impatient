sealed abstract class BinaryTree 
case class Leaf(value: Int) extends BinaryTree 
case class Node(leafs: BinaryTree*) extends BinaryTree

def leafSum(tree: BinaryTree): Int = tree match {
	case Node(leafs @ _*) => leafs.map(leafSum _).sum
	case Leaf(x) => x
}

val x = Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))
println(x)
println(leafSum(x))

sealed abstract class BinaryTree 
case class Leaf(value: Int) extends BinaryTree 
case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

def leafSum(tree: BinaryTree): Int = tree match {
	case Node(left, right) => leafSum(left) + leafSum(right)
	case Leaf(x) => x
}

val x = Node(Node(Leaf(3), Leaf(8)), Leaf(5))
println(x)
println(leafSum(x))

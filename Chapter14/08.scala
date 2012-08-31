sealed abstract class BinaryTree 
case class Leaf(value: Int) extends BinaryTree 
case class Node(op: Char, leafs: BinaryTree*) extends BinaryTree

def eval(tree: BinaryTree): Int = tree match {
	case Node(op, leafs @ _*) => op match {
		case '+' => leafs.map(eval _).sum
		case '-' => -leafs.map(eval _).sum
		case '*' => leafs.map(eval _).product
	}
	case Leaf(x) => x
}

val x = Node('+', Node('*', Leaf(3), Leaf(8)), Leaf(2),  Node('-', Leaf(5)))

println(x)
println(eval(x))

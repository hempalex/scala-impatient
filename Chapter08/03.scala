import collection.immutable.List

abstract class Shape {
	val name = "Abstract shape"
	override def toString = name
}

trait Drawable {
	def draw() = println(toString)
}

class Point(val x: Int, val y: Int) {
	override def toString = "%d,%d".format(x, y)
}

object Point {
	def apply(x: Int = 0, y: Int = 0) = new Point(x, y)
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Shape with Drawable {
	override val name = "Rectangle"
	override def toString = {
		"%s (%s - %s)".format(name, topLeft.toString, bottomRight.toString)
	}
}

class Circle(val center: Point, val radius: Int) extends Shape with Drawable {
	override val name = "Circle"
	override def toString = {
		"%s (%s: %d)".format(name, center.toString, radius)
	}
}

val l: List[Shape with Drawable] = List(
	new Rectangle(Point(1, 1), Point(10, 20)),
	new Circle(Point(2, 2), 5)
)

for (x <- l) x.draw()


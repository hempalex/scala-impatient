class Point(val x: Int, val y: Int) {
	override def toString = "Point(%d, %d)".format(x, y)
}

abstract class Shape {
	def centerPoint: Point
	override def toString =  "%s(Center: %s)".format(this.getClass.getSimpleName, centerPoint.toString)
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Shape {
	override val centerPoint = new Point((bottomRight.x + topLeft.x) / 2, (bottomRight.y + topLeft.y) / 2)
}

class Circle(override val centerPoint: Point, val radius: Int) extends Shape


val r = new Rectangle(new Point(0,0), new Point(10, 10))
println(r)

val c = new Circle(new Point(7, 7), 10)
println(c)

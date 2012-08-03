class Point(val x: Int, val y: Int) {
	override def toString = "Point(%d, %d)".format(x, y)
}

class LabeledPoint(val label: String, x: Int, y: Int) extends Point(x, y) {
	override def toString = { "LabeledPoint(%s, %d, %d)".format(label, x, y) }
}

val a = new Point(1, 1)
println(a)

val b = new LabeledPoint("Some point", 20, 50)
println(b)

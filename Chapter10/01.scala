trait RectangleLike {
	def getX(): Double
	def getY(): Double
	def getWidth(): Double
	def getHeight(): Double
	def setFrame(x: Double, y: Double, width: Double, height: Double)

	def translate(dx: Double, dy: Double) = {
		setFrame(getX() + dx, getY() + dy, getWidth(), getHeight())
	}

	def grow(dx: Double, dy: Double) = {
		setFrame(getX() - dx, getY() - dy, getWidth() + 2 * dx, getHeight() + 2 * dy)
	}

	override def toString = "[%f, %f, %f, %f]".format(getX(), getY(), getWidth(), getHeight())

}


val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
println(egg)

egg.translate(10, -10)
println(egg)

egg.grow(10, 20)
println(egg)
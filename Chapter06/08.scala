object RGBCube extends Enumeration {
	val black = Value(0x000000, "Black")
	val red = Value(0xff0000, "Red")
	val green = Value(0x00ff00, "Green")
	val blue = Value(0x0000ff, "Blue")
	val yellow = Value(0xffff00, "Yellow")
	val magenta = Value(0xff00ff, "Magenta")
	val cyan = Value(0x00ffff, "Cyan")
	val white = Value(0xffffff, "White")
}

for( c <- RGBCube.values ) println("0x%06x: %s".format(c.id, c))


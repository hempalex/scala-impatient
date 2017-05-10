import java.awt.Rectangle

class Square(width: Int = 0, x : Int = 0, y: Int = 0) extends Rectangle(x, y, width, width)


val s1 = new Square(3, 1, 1)
println(s1)

val s2 = new Square()
println(s2)

val s3 = new Square(5)
println(s3)


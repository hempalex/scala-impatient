class ASCIIArt(val art: String) {

	def +(other: ASCIIArt) = new ASCIIArt(
		art.split("\n").zip(other.art.split("\n")).map(x => x._1 + x._2).mkString("\n")
	)
	
	def ^(other: ASCIIArt) = new ASCIIArt(
		art + "\n" + other.art
	)

	override def toString = art
}


val x = new ASCIIArt(
""" /\_/\ 
( ' ' )
(  -  )
 | | | 
(__|__)""")

val y = new ASCIIArt(
"""   -----
 / Hello \
<  Scala |
 \ Coder /
   -----""")

println(x + y)
println(x ^ y)
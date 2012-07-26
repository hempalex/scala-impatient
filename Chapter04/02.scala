import scala.io.Source

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val source = Source.fromFile("gpl.txt", "UTF-8")
val tokens = source.mkString.split("\\s+")

val freq = new scala.collection.mutable.HashMap[String, Int]

tokens foreach { token =>
	if (freq.contains(token))
		freq(token) += 1
	else
		freq(token) = 1
}

prn(freq)

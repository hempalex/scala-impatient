import scala.io.Source

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val source = Source.fromFile("gpl.txt", "UTF-8")
val tokens = source.mkString.split("\\s+")

var freq = new scala.collection.immutable.TreeMap[String, Int]

tokens foreach { token =>
	freq = freq + (token -> (freq.getOrElse(token, 0) + 1) )
}

prn(freq)

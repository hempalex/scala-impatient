import scala.io.Source
import scala.collection.JavaConversions.mapAsScalaMap

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val source = Source.fromFile("gpl.txt", "UTF-8")
val tokens = source.mkString.split("\\s+")

val freq: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]

tokens foreach { token =>
	freq(token) = freq.getOrElse(token, 0) + 1
}

prn(freq)


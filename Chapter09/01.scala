import scala.io.Source
import java.io.PrintWriter
val out = new PrintWriter("01.txt")
val source = Source.fromFile("01.out").getLines.toArray[String].reverse.foreach(out.println(_))
out.close()
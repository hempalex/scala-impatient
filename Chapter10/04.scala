trait Logger {
	def log(msg: String) = {}
}

trait ConsoleLogger extends Logger {
	override def log(msg: String) = Console.println(msg)
}

trait CaesarLogger extends Logger {
	val shift: Int = 3
	override def log(msg: String) = {
		super.log((for(x <- msg) yield (x + shift).toChar).mkString)
		// more elegant
		super.log(msg.map(_ + shift).map(_.toChar).mkString)
		// speedup but less elegant
		super.log(msg.map((x : Char) => (x + shift).toChar).mkString)
	}
}


class Sample extends Logger {
	def doSomeWork() = {
		log("Some Log Message")
	}
}

val x = new Sample with ConsoleLogger
x.doSomeWork

val y = new Sample with ConsoleLogger with CaesarLogger
y.doSomeWork

val z = new { override val shift = -3} with Sample with ConsoleLogger with CaesarLogger
z.doSomeWork

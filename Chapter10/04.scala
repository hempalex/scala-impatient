trait Logger {
	def log(msg: String) = {}
}

trait ConsoleLogger extends Logger {
	override def log(msg: String) = Console.println(msg)
}

trait CaesarLogger extends Logger {
  val key = 3

  private val alphaU='A' to 'Z'
  private val alphaL='a' to 'z'
  private def rot(a:IndexedSeq[Char], c:Char)=a((c-a.head+key+a.size)%a.size)
  
  override def log(msg: String) = {
    super.log(msg.map{
      case c if alphaU.contains(c) => rot(alphaU, c)
      case c if alphaL.contains(c) => rot(alphaL, c)
      case c => c})
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

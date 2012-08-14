import java.io.{InputStream, FileInputStream}

trait Logger {
	def log(msg: String)
}

trait NoneLogger extends Logger {
	def log(msg: String) = {}
}

trait PrintLogger extends Logger {
	def log(msg: String) = println(msg)
}


trait Buffering {
	this: InputStream with Logger =>

	val BUF_SIZE: Int = 5
	private val buf = new Array[Byte](BUF_SIZE)
	private var bufsize: Int = 0
	private var pos: Int = 0

	override def read(): Int = {
		if (pos >= bufsize) {
			bufsize = this.read(buf, 0, BUF_SIZE)
			log("buffered %d bytes: %s".format(bufsize, buf.mkString(", ")))
			if (bufsize > 0) -1
			pos = 0
		}
		pos += 1
		buf(pos-1)
	}
}

val f = new FileInputStream("08.txt") with Buffering with PrintLogger

for(i <- 1 to 10) println(f.read())
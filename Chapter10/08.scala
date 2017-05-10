// read http://stackoverflow.com/questions/10169016/stackoverflow-when-use-bufferedinputstream-as-a-trait-in-scala
import java.io.{InputStream, FileInputStream}


trait Buffering {
	this: InputStream =>

	val BUF_SIZE: Int = 5
	private val buf = new Array[Byte](BUF_SIZE)
	private var bufsize: Int = 0
	private var pos: Int = 0

	override def read(): Int = {
		if (pos >= bufsize) {
			bufsize = this.read(buf, 0, BUF_SIZE)
			if (bufsize > 0) { 
				pos = 0
			} else {
				// nothing additional was read, so return -1
				return -1	
			}
		}
		pos += 1
		buf(pos-1)
	}
}

val f = new FileInputStream("08.txt") with Buffering

for(i <- 1 to 10) println(f.read())

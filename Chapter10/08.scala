// read http://stackoverflow.com/questions/10169016/stackoverflow-when-use-bufferedinputstream-as-a-trait-in-scala

import java.io.{InputStream, BufferedInputStream, FileInputStream}

trait Buffering {
	this: InputStream =>

	private val in = new BufferedInputStream(this)

	override def available(): Int = in.available
 	override def close(): Unit = in.close()
	override def mark(readlimit: Int): Unit = in.mark(readlimit)
	override def markSupported(): Boolean = in.markSupported
	override def read(): Int = in.read()
	override def read(b: Array[Byte], off: Int, len: Int) = in.read(b, off, len)
	override def reset() = in.reset()
	override def skip(n: Long): Long = in.skip(n: Long)
}

val arr = new Array[Byte](10)w

val f = new FileInputStream("08.txt") with Buffering


f.read(arr, 0, 10)
println(arr)

f.reset()
f.skip(5)

val b: Int = f.read()

println(b)


abstract class IterableInputStream extends java.io.InputStream with Iterable[Byte] {

	class InputStreamIterator(outer: IterableInputStream) extends Iterator[Byte] {
		def hasNext: Boolean = outer.available() > 0
		def next: Byte = outer.read().toByte
	}

	def iterator: Iterator[Byte] = new InputStreamIterator(this)

}
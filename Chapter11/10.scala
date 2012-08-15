object RichFile { 
	def unapplySeq(s: String): Option[Seq[String]] = {
		if (s.trim == "") None else Some(s.trim.split("/")) 
	}
}

val RichFile(first, middle, last) = "home/user/text.txt"

println("First: %s, Middle: %s, Last: %s".format(first, middle, last))
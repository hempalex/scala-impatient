object RichFile { 
	def unapply(s: String) = {
		val pos = s.lastIndexOf("/") 
		if (pos == -1) None else Some((s.substring(0, pos), s.substring(pos + 1)))
  	} 
}

val RichFile(path, name) = "/home/user/test.txt"

println("Path: %s, File: %s".format(path, name))

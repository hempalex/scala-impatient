object RichFile {
  def unapply(input : String) = {
    val parts = input.split("/")
    val fileParts = parts.last.split("\\.")
    Some(parts.take(parts.size-1).mkString("/"), fileParts(0),fileParts(1))
  }
}

val RichFile(path, filename, ext) = "/etc/foobar/passwd.txt"
println("Directory: %s Filename: %s Extension: %s".format(path, filename, ext))

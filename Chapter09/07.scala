val tokens = io.Source.fromFile("07.txt").mkString.split("""\s+""").filter(
	"^[0-9]+(\\.[0-9]+)?$".r findFirstIn _ match {
		case Some(_) => false
		case None => true
	}
)

println("Tokents: " + tokens.mkString(", "))
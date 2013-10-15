def MapToHtml(x: Map[String, String]) = {
	<dl>{for ((k,v) <- x) yield <dt>{k}</dt><dd>{v}</dd>}</dl>
}

val x = Map("A" -> "1", "B" -> "2")

println(MapToHtml(x))
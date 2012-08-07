val html = io.Source.fromURL("http://horstmann.com", "UTF-8").mkString

val srcPattern = """(?is)<\s*img[^>]*src\s*=\s*['"\s]*([^'"]+)['"\s]*[^>]*>""".r

for(srcPattern(s) <- srcPattern findAllIn html) println(s)

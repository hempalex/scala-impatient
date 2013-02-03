// scala -classpath ./*.jar 05.scala

import scala.xml.XML

val parser = (new org.ccil.cowan.tagsoup.jaxp.SAXFactoryImpl).newSAXParser
val html = XML.withSAXParser(parser).load(new java.net.URL("http://autopeople.ru/"))
val src = (html \\ "img").flatMap(_.attributes("src"))

println(src.mkString("\n"));



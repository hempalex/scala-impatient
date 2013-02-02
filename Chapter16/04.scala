// scala -classpath ./*.jar 04.scala

import scala.xml.XML

val parser = (new org.ccil.cowan.tagsoup.jaxp.SAXFactoryImpl).newSAXParser
val html = XML.withSAXParser(parser).load(new java.net.URL("http://autopeople.ru/"))
val images = (html \\ "img").filterNot(_.attributes("alt").isDefined)

println(images.mkString("\n"));


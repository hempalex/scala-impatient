// scala -classpath ./*.jar 04.scala

import scala.xml._

val parser = (new org.ccil.cowan.tagsoup.jaxp.SAXFactoryImpl).newSAXParser
val html = XML.withSAXParser(parser).load(new java.net.URL("http://yandex.ru/"))

val links = (html \\ "a") map ( (x: NodeSeq) => (x.attributes("href").toString, x.text)).filter(_._1.startsWith("http://"))

println(links.mkString("\n"));



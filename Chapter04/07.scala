import scala.collection.JavaConversions.mapAsScalaMap

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val props = mapAsScalaMap(System.getProperties().asInstanceOf[java.util.Map[String, String]])

val maxkey = props.keySet.map(_.length).max

for( (k,v) <- props ) printf("%-" + maxkey + "s | %s\n", k, v)
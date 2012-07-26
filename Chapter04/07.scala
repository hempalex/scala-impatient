import scala.collection.JavaConversions.propertiesAsScalaMap

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val props = propertiesAsScalaMap(System.getProperties())

val maxkey = props.keySet.map(_.length).max

for( (k,v) <- props ) printf("%-" + maxkey + "s | %s\n", k, v)
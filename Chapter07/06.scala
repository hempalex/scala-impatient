import java.util.{HashMap => JavaHashMap, Map => JavaMap}
import collection.mutable.{HashMap => ScalaHashMap, Map => ScalaMap}
import collection.JavaConversions.mapAsScalaMap

val j: ScalaMap[Int, String] = new java.util.HashMap[Int,String]

j.put(1, "One");
j.put(2, "Two");

val s: ScalaMap[Int, String] = new ScalaHashMap();

for((k, v) <- j) s += ( k -> v)

println(s)




import java.util.{HashMap => JavaHashMap, Map => JavaMap}
import collection.mutable.{HashMap => ScalaHashMap, Map => ScalaMap}
import collection.JavaConverters._

val j: JavaMap[Int, String] = new JavaHashMap[Int, String]

j.put(1, "One")
j.put(2, "Two")

val s: ScalaMap[Int, String] = new ScalaHashMap()

for ((k, v) <- j.asScala) s += (k -> v)

println(s)

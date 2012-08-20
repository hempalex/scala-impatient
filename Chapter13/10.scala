import scala.io.Source
val str = Source.fromFile("10.txt").mkString

val start1 = System.currentTimeMillis()
val freq1 = new scala.collection.mutable.HashMap[Char, Int] 
for (c <- str) freq1(c) = freq1.getOrElse(c, 0) + 1
val end1 = System.currentTimeMillis()
println("Time using mutable collection: %d".format(end1 - start1))
println(freq1.toSeq.sorted)

val start2 = System.currentTimeMillis()
val freq2 = str.par.map(c => (c, 1)).groupBy(_._1).map(x => (x._1, x._2.length))
val end2 = System.currentTimeMillis()
println("Time using parallel collection: %d".format(end2 - start2))
println(freq2.seq.toSeq.sorted)




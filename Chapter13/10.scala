val str = io.Source.fromFile("10.txt").mkString

def printMills(msg: String)(block: => Unit) {
	val start = System.currentTimeMillis()
	block
	val end = System.currentTimeMillis()
	println(msg.format(end-start))
}

printMills("Using mutable collection: %d ms") {
	val freq = new collection.mutable.HashMap[Char, Int] 
	for (c <- str) freq(c) = freq.getOrElse(c, 0) + 1
	println(freq.toSeq.sorted)
}


printMills("Using immutable collection: %d ms") {
	val freq = str.map(c => (c, 1)).groupBy(_._1).map(x => (x._1, x._2.length))
	println(freq.seq.toSeq.sorted)
}

printMills("Using mutable parallel collection: %d ms") {

	val freq = str.par.aggregate(new collection.immutable.HashMap[Char, Int])(
		(x, c) => x + (c ->(x.getOrElse(c, 0) + 1)),
		(map1, map2) => map1 ++ map2.map{ case (k,v) => k -> (v + map1.getOrElse(k,0)) }		
	)

	println(freq.toSeq.sorted)
}
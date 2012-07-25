def randomArray(n: Int) = {
	val a = new Array[Int](n);
	for (i <- 0 until a.size) a(i) = util.Random.nextInt(n * 2) - n
	a
}
def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val arr = randomArray(10).toBuffer

prn(arr)

val indexes = ( for(i <- 0 until arr.size; if (arr(i) < 0)) yield i).reverse.dropRight(1).foreach(arr.remove(_))

prn(arr)
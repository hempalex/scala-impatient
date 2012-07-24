import util.Random

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

def randomArray(n: Int) = {
	val a = new Array[Int](n);
	for (i <- 0 until a.size) a(i) = Random.nextInt(n)
	a
}

val arr = randomArray(10)

prn(arr)
prn(arr.distinct)
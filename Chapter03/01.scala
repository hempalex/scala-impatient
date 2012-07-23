import util.Random

def randomArray(n: Int) = {
	val a = new Array[Int](n);
	for (i <- 0 until a.size) a(i) = Random.nextInt(n);
	a
}

println(randomArray(7).mkString("Array(", ", ", ")"))
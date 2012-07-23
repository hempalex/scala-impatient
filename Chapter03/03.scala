import util.Random

def randomArray(n: Int) = {
	val a = new Array[Int](n);
	for (i <- 0 until a.size) a(i) = Random.nextInt(n);
	a
}

def swapAdj(a: Array[Int]) = {
	for(i <- 0 until a.size)
		yield if (i % 2 == 0)
				if (i < a.size-1)
					a(i+1)
				else
					a(i)
			else a(i-1)
}

val test = randomArray(9);
val res = swapAdj(test);

println(test.mkString("Array(", ", ", ")"))
println(res.mkString("Array(", ", ", ")"))
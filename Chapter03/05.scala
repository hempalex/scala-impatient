import util.Random

def randomArray(n: Int) = {
	val a = new Array[Double](n);
	for (i <- 0 until a.size) a(i) = Random.nextDouble;
	a
}

def avg(a: Array[Double]) = a.sum / a.size;

val test = randomArray(1000000);
val res = avg(test);

//println(test.mkString("Array(", ", ", ")"))
println(res)
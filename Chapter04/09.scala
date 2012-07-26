import util.Random

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

def randomArray(n: Int) = {
	val a = new Array[Int](n);
	for (i <- 0 until a.size) a(i) = Random.nextInt(n)
	a
}

def lteqgt(values: Array[Int], v : Int) = (
	values.count(_ < v),
	values.count(_ == v),
	values.count(_ > v)
)

val arr = randomArray(10)

prn(arr)

val res = lteqgt(arr, 5)

println(res)
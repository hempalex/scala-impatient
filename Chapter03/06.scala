import util.Random

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

def randomArray(n: Int) = {
	val a = new Array[Int](n);
	for (i <- 0 until a.size) a(i) = Random.nextInt(n);
	a
}

val arr = randomArray(10);
val buf = arr.toBuffer

val sorted_arr = arr.sortWith(_ > _)
val sorted_buf = buf.sorted.reverse

prn(arr)
prn(buf)
prn(sorted_arr)
prn(sorted_buf)

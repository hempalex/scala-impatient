import scala.collection.mutable._

def indexes(s: String) = {
	var res = new HashMap[Char, LinkedHashSet[Int]]()

	for((c, i) <- s.zipWithIndex) {
		val set = res.getOrElse(c.toChar, new LinkedHashSet[Int])
		set += i
		res(c.toChar) = set 
	}

	res
}

val x = indexes("Missisipi")
println(x)
val a = new Array[Int](10).map(x => util.Random.nextInt(10))

println(a.mkString(","))

val max = a.reduceLeft((x, y) => if (x > y) x else y)

println(max)
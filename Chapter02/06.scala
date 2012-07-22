
def prod(s: String) = {
	var res: Long = 1;
	for( ch <- s ) res *= ch.toLong
	res
}


println(prod("Hello"))
println("Hello".foldLeft(1L)(_ * _.toLong))
def prod(s: String) : Long = {
	if (s.size > 0)
		prod(s.tail) * s.head.toLong
	else
		1
}

println(prod("Hello"));
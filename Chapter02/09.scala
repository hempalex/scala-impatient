def prod(s: String) : Long = {
	if (s.size > 0)
		 s.head.toLong * prod(s.tail)
	else
		1
}

println(prod("Hello"));

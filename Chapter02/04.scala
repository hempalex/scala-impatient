def countdown(n: Int) = {
	for( i <- Range(n, 0, -1) )
		println(i)
}

countdown(5);
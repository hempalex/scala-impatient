def func(x: Double, n: Int): Double = {
	if (n == 0) 1
	else {
		if (n > 0) {
			if ( n % 2 == 0 && n > 2) {
				func(func(x, n/2), 2)
			} else {
				x * func(x, n - 1)
			}
		} else (1 / func(x, -n))
	}
}

printf("2^2=%f\n", func(2, 2));
printf("10^9=%f\n", func(10, 9));
printf("3^3=%f\n", func(3, 3));
printf("2^-1=%f\n", func(2, -1));
printf("5^0=%f\n", func(5, 0));
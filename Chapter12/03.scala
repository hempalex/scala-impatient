def fac(n: Int) = (0 to n).reduceLeft((a, b) => if(a == 0) 1 else (a * b)) 

for(i <- 0 to 10) {
  println("%d %d".format(i, fac(i)))
}

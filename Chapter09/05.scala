val out = new java.io.PrintWriter("05.out")
for(i <- 0 to 20) out.println("%8.0f    %f".format(math.pow(2.0, i), math.pow(2.0, -i)))
import math.sqrt

type T = Double => Option[Double]

def compose(f: T, g: T): T = { 
	(x: Double) => f(x) match {
		case Some(x) => g(x)
		case None => None
	}
}

def f(x: Double) = if (x >= 0) Some(sqrt(x)) else None 
def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None 
val h = compose(f, g)

println(h(4))
println(h(1))
println(h(0))
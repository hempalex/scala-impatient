def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val gizmos = Map("iPad3" -> 700, "iPhone 5" -> 600, "MacBook Pro Retina" -> 2000)

val discount = for( (k,v) <- gizmos ) yield (k, v * 0.9)

prn(gizmos)
prn(discount)
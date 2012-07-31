// scalac 03.scala && scala Q3

package object random {
	var seed : Int = 0

	def setSeed(value: Int) = seed = value
	def nextInt() = {
		seed = seed * 1664525 + 1013904223 % (2 ^ 32)
		seed
	}
	def nextDouble() : Double = nextInt().toDouble / Int.MaxValue.toDouble
}

import random._

object Q3 extends App {

	setSeed((System.currentTimeMillis() / 1000).toInt)

	println(seed)
	(1 to 5).foreach(x => println(nextInt()))
	(1 to 5).foreach(x => println(nextDouble()))
}
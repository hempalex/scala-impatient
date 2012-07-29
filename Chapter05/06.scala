class Person(var age: Int = 0) {
	if (age < 0) age = 0
}

val p = new Person(5)
println(p.age)

val n = new Person(-5)
println(n.age)

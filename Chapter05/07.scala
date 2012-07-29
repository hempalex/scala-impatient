class Person(name: String) {
	val firstName = name.split("\\s+")(0)
	val lastName = name.split("\\s+")(1)

	override def toString = "Person(" + firstName + ", " + lastName + ")"
}

val p = new Person("John Smith")
println(p)
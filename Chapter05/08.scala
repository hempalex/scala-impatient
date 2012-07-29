class Car(val manufactuer : String, val model: String, val year: Int = -1, var license: String = "") {
	override def toString = "Car(%s, %s, %d, %s)".format(manufactuer, model, year, license)
}

val c1 = new Car("Honda", "Civic", 2011, "xx123zz")
println(c1)
val c2 = new Car("Hummer", "H1", 2010)
println(c2)
val c3 = new Car("Opel", "Astra")
println(c3)

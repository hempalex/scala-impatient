/*
 * rewrite following class to it's long version
*/
class Employee(val name: String, var salary: Double) {
	def this() { this("John Q. Public", 0.0) }
	override def toString = "Employee(%s, %f)".format(name, salary)
}

// i'm not supposed to do, but a right direction
// proposed by Cay Horstmann: http://stackoverflow.com/a/10999828

class LongEmployee {
	private var _name = "John Q. Public"
	var salary = 0.0

	def this(n: String, s: Double) {
		this()
		_name = n;
		salary = s;
	}

	def name = _name // read-only property, but private var
	override def toString = "LongEmployee(%s, %f)".format(name, salary)
}


val e1 = new Employee()
println(e1)

val l1 = new LongEmployee()
println(l1)

val e2 = new Employee("John Smith", 100.5)
println(e2)

val l2 = new LongEmployee("John Smith", 100.5)
println(l2)
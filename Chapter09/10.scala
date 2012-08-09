import collection.mutable._
import java.io._

class Person(val name: String) extends Serializable {
	private val friends = new ArrayBuffer[Person]
	// some kind of DSL :-)
	def friend(f : Person) = friends += f
	override def toString = "%s {%s}".format(name, friends.map(_.name).mkString(", "))
}

object Person {
	def apply(name : String) = new Person(name)
}

object Main extends App {

	val anna = Person("Anna")
	val boris = Person("Boris")
	val clair = Person("Clair")

	anna friend boris
	boris friend anna
	anna friend clair
	clair friend boris

	val all = Array(anna, boris, clair)

	println("Original objects: " + all.mkString(", "))

	val out = new ObjectOutputStream(new FileOutputStream("10.out"))
	out.writeObject(all)
	out.close()

	val in = new ObjectInputStream(new FileInputStream("10.out"))
	val res = in.readObject().asInstanceOf[Array[Person]]
	in.close()

	println("Restored objects: " + res.mkString(", "))
}
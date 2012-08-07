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

	println("Original objects:")

	println(anna)
	println(boris)
	println(clair)

	val out = new ObjectOutputStream(new FileOutputStream("10.out"))
	out.writeObject(anna)
	out.writeObject(boris)
	out.writeObject(clair)
	out.close()

	val in = new ObjectInputStream(new FileInputStream("10.out"))
	val savedAnna = in.readObject().asInstanceOf[Person]
	val savedBoris = in.readObject().asInstanceOf[Person]
	val savedClair = in.readObject().asInstanceOf[Person]
	in.close()

	println("Restored objects:")

	println(savedAnna)
	println(savedBoris)
	println(savedClair)

}
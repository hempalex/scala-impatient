trait Animal {
	val name: String
	def words: String = ""
	def say = println("%s: %s".format(name, words))
}

trait Endothermy
trait Hypotermy

trait Mammal extends Animal with Endothermy

class Dog extends Mammal {
	val name = "Bethoven"
	override val words = "Haw-Haw"
}

class Cat extends Mammal {
	val name = "Pixel"
	override val words = "Meow!"
	override def say = {
		print("Cat: ")
		super.say
	}
}

val d = new Dog()
val c = new Cat()

d.say
c.say



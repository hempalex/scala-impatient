import collection.immutable.List

abstract class Item {
	def description: String
	def price: Double
	override def toString =  "%s(%s: %f)".format(this.getClass.getSimpleName, description, price)
}

class SimpleItem(
		override val description: String,
		override val price: Double
	) extends Item

class Bundle extends Item {
	private var items: List[Item] = List()
	def add(item : Item) = { items = item :: items }
	def price: Double = items.map(_.price).sum
	def description: String = items.map(_.description).mkString(", ")
}


var l: List[Item] = List(
		new SimpleItem("iMac 21", 1500),
		new SimpleItem("iPhone 4s", 800)
	)

val b = new Bundle
b.add(new SimpleItem("iPad2", 500))
b.add(new SimpleItem("MacBook Air 13", 1200))

l = b :: l

l.foreach(println(_))


abstract class Item 
case class Article(description: String, price: Double) extends Item 
case class Bundle(description: String, discount: Double, items: Item*) extends Item
case class Multiple(count: Int, item: Item) extends Item

def price(it: Item): Double = it match { 
  case Article(_, p) => p 
  case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc 
  case Multiple(count, item) => price(item) * count
}

val x = Bundle("Father's day special", 20.0, 
  Multiple(1, Article("Scala for the Impatient", 39.95)), 
  Bundle("Anchor Distillery Sampler", 10.0, 
    Article("Old Potrero Straight Rye Whiskey", 79.95), 
    Article("Junípero Gin", 32.95)
  )
)

println(price(x))


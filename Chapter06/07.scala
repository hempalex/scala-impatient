object CardSuits extends Enumeration {
	type CardSuits = Value
	val spade = Value("♠")
	val club = Value("♣")
	val heart = Value("♥")
	val diamond = Value("♦")

	def isRed(card: CardSuits) = card == heart || card == diamond
}

println(CardSuits.isRed(CardSuits.spade));
println(CardSuits.isRed(CardSuits.club));
println(CardSuits.isRed(CardSuits.heart));
println(CardSuits.isRed(CardSuits.diamond));
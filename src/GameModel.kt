/**
 * Created by rluick on 10/19/2016.
 */
class GameModel {

    val deck = Deck()
    val wastePile: MutableList<Card> = arrayListOf()
    val foundationPiles = arrayOf(FoundationPile(clubs), FoundationPile(diamonds),
            FoundationPile(hearts), FoundationPile(spades))
}
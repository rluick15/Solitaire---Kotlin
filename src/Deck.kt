/**
 * Created by rluic on 10/12/2016.
 */
class Deck {

    val card: Array<Card> = Array(52, fun (i: Int): Card {
        val value = i % 13
        val suit = when(i / 13) {
            0 -> "Clubs"
            1 -> "Diamons"
            2 -> "Hearts"
            else -> "Spades"
        }
        return Card(value, suit)
    })
}
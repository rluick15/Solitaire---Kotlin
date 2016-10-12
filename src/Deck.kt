/**
 * Created by rluic on 10/12/2016.
 */
class Deck {

    val cards = Array(52, { Card(it % 13, getSuit(it)) })

    private fun getSuit(i: Int) = when(i / 13) {
        0 -> "Clubs"
        1 -> "Diamons"
        2 -> "Hearts"
        else -> "Spades"
    }
}
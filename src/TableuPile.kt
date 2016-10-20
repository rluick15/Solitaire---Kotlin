/**
 * Created by rluic on 10/19/2016.
 */
class TableuPile(var cards: MutableList<Card> = arrayListOf()) {

    init {
        if(cards.size > 0) {
            cards.last().faceUp = true
        }
    }

    fun addCards(newCards: MutableList<Card>): Boolean {
        if(cards.size > 0) {
            if (newCards.first().value == cards.last().value - 1 && suitCheck(newCards.first(), cards.last())) {
                cards.addAll(newCards)
                return true
            }
        } else if(newCards.first().value == 12) {
            cards.addAll(newCards)
            return true
        }
        return false
    }

    fun removeCards(tappedIndex: Int) {
        for (i in tappedIndex..cards.lastIndex) {
            cards.removeAt(i)
        }

        if (cards.size > 0) {
            cards.last().faceUp = true
        }
    }

    private fun suitCheck(c1: Card, c2: Card): Boolean {
        if ((redSuits.contains(c1.suit) && blackSuits.contains(c2.suit)) ||
                (redSuits.contains(c2.suit) && blackSuits.contains(c1.suit))) {
            return true
        }
        return false
    }
}
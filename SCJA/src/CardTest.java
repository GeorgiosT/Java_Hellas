import java.util.*;

enum Suit {
	SPADE, DIAMOND, ClUB, HEART
}

enum Rank {
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

// a card
class Card {
	private Suit suit;
	private Rank rank;

	// constructor
	Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

	/*Rank getRank() {
		return rank;
	}

	Suit getSuit() {
		return suit;
	}
*/
	public String toString() {
		return "This card is " + rank + " of " + suit;
	}
}

// a deck of cards
class CardDeck {
	List<Card> deck;

	CardDeck(){// constructor
		deck = new ArrayList<Card>();
		for (Suit suit : Suit.values()){
			for (Rank rank : Rank.values()){
				deck.add(new Card(suit,rank));
			
		}
		
	}
	}

	public void print() {
		for (Card card : deck)
			System.out.println(card);// print all cards
	}

	public void shuffle() {
		Collections.shuffle(deck);// use Java.Util.Collections static method to
									// shuffle the List
	}

}

public class CardTest {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.print();
		deck.shuffle();
		deck.print();

	}
}

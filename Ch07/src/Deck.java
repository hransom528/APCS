import java.util.*;
import java.util.Random;

public class Deck{
	/**
	 * Instance data:
	 * cards : ArrayList of Card objects to represent a Deck of cards
	 * MAX_SIZE : static final int for size of a deck (Given below)
	 */	
	private ArrayList<Card> cards = new ArrayList<Card>();
	public static final int MAX_SIZE = 52;

	// *******************	
	// *** CONSTRUCTOR ***
	// *******************	
	/**
	 * Constructor that calls the reset method to set up the deck
	 */
	public Deck() {
		reset();
	}

	// ***************	
	// *** METHODS ***
	// ***************
	/**
	 * reset : Initializes the cards ArrayList. 
	 * 			Calls addSuit for each suit creating all ranks for that suit.
	 * 			Add the suits in this order: spades, hearts, diamonds, clubs
	 * 	 Example code: addSuit("spades"); 
	 */
	public void reset() {
		this.addSuit("spades");
		this.addSuit("hearts");
		this.addSuit("diamonds");
		this.addSuit("clubs");
	}

	/**
	 * addSuit : For all the ranks of cards (2 to 14), add a new Card
	 * 			object to the cards ArrayList.
	 * @param suit : String for the suit of the card.
	 */
	public void addSuit(String suit) {
		for (int i = 2; i <= 14; i++) {
			cards.add(new Card(suit, i));
		}
	}

	/**
	 * isEmpty : Returns whether the cards ArrayList is empty or not.
	 * @return true if the ArrayList is empty, false otherwise.
	 */
	public boolean isEmpty() {
		return this.cards.isEmpty();
	}

	/**
	 * size : Returns the size of the cards ArrayList.
	 * @return the size of the ArrayList
	 */
	public int size() {
		return this.cards.size();
	}

	/**
	 * deal : If the deck is not empty (use the isEmpty method), 
	 * 		then remove and return the last card in the deck (ArrayList)
	 * @return a card object from the deck, null if the deck is empty.
	 */
	public Card deal() {
		Card returnCard;
		if (!this.isEmpty()) {
			returnCard = this.cards.get(this.size() - 1);
			this.cards.remove(this.size() - 1);
			return returnCard;
		}
		else {
			return null;
		}
	}

	/**
	 * shuffle : Shuffles the deck (ArrayList)
	 */
	public void shuffle() {
	   Random generator = new Random(1);
		if (cards.size() < MAX_SIZE)
			return;
		Card[] array = new Card[MAX_SIZE];
		while (cards.size() > 0){
			Card card = cards.remove(cards.size() - 1);
			int i = (int) (generator.nextDouble() * MAX_SIZE);   
			while (array[i] != null)
				i = (int) (generator.nextDouble() * MAX_SIZE);
			array[i] = card;
		}
		for (Card card : array)
			cards.add(card);
	}

	/**
	 * toString : Returns a String of all the cards in the deck. 
	 * 		One card per line. Use the toString method for the card
	 * 		object to do this.
	 * @return a String
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < this.cards.size(); i++) {
			sb.append(cards.get(i).toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}
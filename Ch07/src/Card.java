public class Card {
	/**Instance data:
	 * suit : String for suit of the card
	 * rank : int value for rank of the card 
	 */
	private String suit;
	private int rank;

	/**
	 * Constructor that takes in a suit and rank and saves
	 * them into the private fields
	 * @param suit : suit of the card 
	 * @param rank : rank of the card
	 */
	public Card(String suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	// ***************	
	// *** METHODS ***
	// ***************
	/**
	 * equals : Tests to see if a Card object is the same as another Card
	 * @param otherCard : Card object of another card
	 * @return true if the cards are the same, false otherwise.
	 */
	public boolean equals(Card otherCard) {
		if ((this.rank == otherCard.getRank()) && (this.suit.equals(otherCard.suit))) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * compareTo : Finds the difference between this Card's rank and 
	 * 				another Card's rank
	 * @param otherCard : Card object of another card
	 * @return the int difference between the rank of this Card	
	 */
	public int compareTo(Card otherCard) {
		return (this.getRank() - otherCard.getRank());
	}

	/**
	 * getRank : Returns the rank of the Card
	 * @return rank : rank of the Card
	 */
	public int getRank() {
		return this.rank;
	}

	/**
	 * getSuit : Returns the suit of the Card
	 * @return suit : suit of the Card
	 */
	public String getSuit() {
		return this.suit;
	}

	/**
	 * rankToString : Returns a String for the rank.
	 * 		14 = "Ace"
	 * 		13 = "King"
	 * 		12 = "Queen"
	 * 		11 = "Jack"
	 * @return String of the rank
	 */
	public String rankToString() {
		switch (this.rank) {
		case 14:
			return "Ace";
		case 13:
			return "King";
		case 12:
			return "Queen";
		case 11:
			return "Jack";
		default:
			return Integer.toString(this.getRank());
		}
	}

	/**
	 * toString : Returns a string that describes the card by rank and suit.
	 * 				Should call the rankToString method.
	 * 		Examples: 
	 * 			"Ace of spades"
	 * 			"Jack of hearts"
	 * 			"5 of clubs"
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.rankToString());
		sb.append(" of ");
		sb.append(this.getSuit());
		return sb.toString();
	}
}
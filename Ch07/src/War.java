import java.util.ArrayList;

public class War {
	static Deck deck = new Deck();
	static ArrayList<Card> player1 = new ArrayList<Card>();
	static ArrayList<Card> player2 = new ArrayList<Card>();
	static int warCard = 4;

	//MAIN
	public static void main(String[] args) {
		deck.shuffle();

		while (!deck.isEmpty()) {
			player1.add(deck.deal());
			player2.add(deck.deal());
		}

		while (!player1.isEmpty() && !player2.isEmpty()) {
			System.out.println("Player 1 plays: " + player1.get(0).toString());
			System.out.println("Player 2 plays: " + player2.get(0).toString());

			if (player1.get(0).compareTo(player2.get(0)) > 0) {
				System.out.println("Player 1 wins");
				player1.add(player1.remove(0));
				if (player2.size() > 0) {
					player1.add(player2.get(0));
					player2.remove(0);
				}

			}
			else if (player1.get(0).compareTo(player2.get(0)) < 0) {
				System.out.println("Player 2 wins");
				player2.add(player2.remove(0));
				if (player1.size() > 0) {
					player2.add(player1.get(0));
					player1.remove(0);
				}
			}
			else {
				System.out.println("WAR!");
				goToWar();
			}
		}

		System.out.println();
		System.out.println("Player 1's Cards: " + player1.size() + " Cards");
		//for (Card i : player1)
		//	System.out.println(i);

		System.out.println();
		System.out.println("Player 2's Cards: " + player2.size() + " Cards");
		//for (Card i : player2) {
		//	System.out.println(i);
		//}

		if (player1.size() != 0) {
			System.out.println("Player 1 wins the game!");
		}
		else {
			System.out.println("Player 2 wins the game!");
		}
	}
	
	private static void goToWar() {
		while ((player1.size() < warCard || player2.size() < warCard) && warCard > 1) {
			warCard--;
		}

		if (player1.get(warCard - 1).compareTo(player2.get(warCard - 1)) > 0) {
			System.out.println("Player 1 wins");
			for (int i =0; i<= warCard; i++) {
				player1.add(player1.remove(0));
				if (player2.size() > 0)
					player1.add(player2.remove(0));
			}
		}
		else if (player1.get(warCard - 1).compareTo(player2.get(warCard - 1)) < 0) {
			System.out.println("Player 2 wins");
			for (int i =0; i<= warCard - 1; i++) {
				player2.add(player2.remove(0));
				if (player1.size() > 0)
					player2.add(player1.remove(0));
			}
		}
		else {
			System.out.println("WAR!");
			warCard +=4;
			goToWar();
		}
	}
}
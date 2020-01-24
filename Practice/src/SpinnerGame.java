//AP Practice FRQ Part 2
import java.util.Random;

public class SpinnerGame {
	/** Precondition: min < max

	 * Simulates a spin of a spinner by returning a random integer

	 * between min and max, inclusive.
	 */
	public static int spin(int min, int max) {
		Random rand = new Random();
		int result = rand.nextInt((max - min) + 1) + min;
		return result;
	}

	/** Simulates one round of the game as described in part (b).

	 */
	public static void playRound() {
		int playerSpin1 = spin(1, 10);
		int playerSpin2 = 0;
		int computerSpin1 = spin(2, 8);
		int computerSpin2 = 0;
		int sum1 = 0;
		int sum2 = 0;
		int result;

		if (playerSpin1 > computerSpin1) {
			result = playerSpin1 - computerSpin1;
			System.out.println("You win! " + result + " points");
		}
		else if (playerSpin1 < computerSpin1) {
			result = playerSpin1 - computerSpin1;
			System.out.println("You lose. " + result + " points");
		}
		else {
			playerSpin2 = spin(1, 10);
			computerSpin2 = spin(2, 8);
			sum1 = playerSpin1 + playerSpin2;
			sum2 = computerSpin1 + computerSpin2;
			if (sum1 > sum2) {
				System.out.println("You win! 1 points");  
			}
			else if (sum1 < sum2) {
				System.out.println("You lose! -1 points");
			}
			else {
				System.out.println("Tie. 0 points");
			}
		}
	}
}
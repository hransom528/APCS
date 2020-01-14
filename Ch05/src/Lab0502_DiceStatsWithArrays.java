import java.util.Random;
import java.util.Scanner;

public class Lab0502_DiceStatsWithArrays {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random randGen = new Random(1);
		int numRolls = 0;   // User defined number of rolls
		int[] nums = new int[11];
		int die1;       // Dice values
		int die2;       // Dice values
		int rollTotal;  // Sum of dice values

		// Get initial number of rolls from the user
		System.out.println("Enter number of rolls (0 to quit): ");
		numRolls = scnr.nextInt();

		// If the value of numRolls is 1 or more, roll the die and collect the data
		while (numRolls >= 1) {
			// Roll dice numRoll times
			for (int i = 0; i < numRolls; ++i) {
				die1 = randGen.nextInt(6) + 1;
				die2 = randGen.nextInt(6) + 1;
				rollTotal = die1 + die2;

				// Count number of times each dice total occurs
				switch (rollTotal) {
				case 2:
					nums[0] += 1;
					break;
				case 3:
					nums[1] += 1;
					break;
				case 4:
					nums[2] += 1;
					break;
				case 5: 
					nums[3] += 1;
					break;
				case 6: 
					nums[4] += 1;
					break;
				case 7:
					nums[5] += 1;
					break;
				case 8:
					nums[6] += 1;
					break;
				case 9: 
					nums[7] += 1;
					break;
				case 10: 
					nums[8] += 1;
					break;
				case 11: 
					nums[9] += 1;
					break;
				case 12: 
					nums[10] += 1;
					break;
				default:
					System.out.println("Error in switch statement!");
					break;
				}

				System.out.println("Roll " + (i+1) + " is " + 
						rollTotal + " (" + die1 + 
						"+" + die2 + ")");
			}

			//Print statistics on dice rolls
			System.out.println("Dice roll statistics:");
			for (int i = 0; i < nums.length; i++) {
				System.out.println((i + 2) + "s:\t" + nums[i]);
			}

			// Print histogram of dice rolls
			System.out.println("\nDice roll histogram for " + numRolls + " roll(s):");
			for (int i = 0; i < nums.length; i++) {
				System.out.print(i + 2 + ":  ");
				for (int c = 0; c < nums[i]; c++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}

			// reset counting variables
			for (int i = 0; i < nums.length; i++) {
				nums[i] = 0;
			}

			// Ask the user for another number of rolls
			System.out.print("\nEnter number of rolls (0 to quit): ");
			numRolls = scnr.nextInt();

		} 

		//Close the program
		System.out.println("\nThank you for playing!");
		scnr.close();
		System.exit(0);
	}

}
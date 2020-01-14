package src;
import java.util.Scanner;
import java.util.Random;
public class Lab0404_DiceStats {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Random randGen = new Random(1);
		int i;          	 // Loop counter iterates numRolls times
		int numRolls;   	 // User defined number of rolls

		int numTwos = 0;     // Tracks number of 2s found
		int numThrees = 0;   // Tracks number of 3s found
		int numFours = 0;    // Tracks number of 4s found
		int numFives = 0;    // Tracks number of 5s found
		int numSixes = 0;    // Tracks number of 6s found
		int numSevens = 0;   // Tracks number of 7s found
		int numEights = 0;   // Tracks number of 8s found
		int numNines = 0;    // Tracks number of 9s found
		int numTens = 0;     // Tracks number of 10s found
		int numElevens = 0;  // Tracks number of 11s found
		int numTwelves = 0;  // Tracks number of 12s found

		String numTwoString    = "";
		String numThreeString  = "";
		String numFourString   = "";
		String numFiveString   = "";
		String numSixString    = "";
		String numSevenString  = "";
		String numEightString  = "";
		String numNineString   = "";
		String numTenString    = "";
		String numElevenString = "";
		String numTwelveString = "";

		int die1;       	// Dice values
		int die2;       	// Dice values
		int rollTotal;  	// Sum of dice values

		while (true) {
			System.out.println("Enter number of rolls (0 to quit): ");
			numRolls = scnr.nextInt();

			if (numRolls >= 1) {
				// Roll dice numRoll times
				for (i = 0; i < numRolls; ++i) {
					die1 = randGen.nextInt(6) + 1;
					die2 = randGen.nextInt(6) + 1;
					rollTotal = die1 + die2;

					// Count number of totals
					if (rollTotal == 2) {
						numTwos += 1;
					}
					else if (rollTotal == 3) {
						numThrees += 1;
					}
					else if (rollTotal == 4) {
						numFours += 1;
					}
					else if (rollTotal == 5) {
						numFives += 1;
					}
					else if (rollTotal == 6) {
						numSixes += 1;
					}
					else if (rollTotal == 7) {
						numSevens += 1;
					}
					else if (rollTotal == 8) {
						numEights += 1;
					}
					else if (rollTotal == 9) {
						numNines += 1;
					}
					else if (rollTotal == 10) {
						numTens += 1;
					}
					else if (rollTotal == 11) {
						numElevens += 1;
					}
					else if (rollTotal == 12) {
						numTwelves += 1;
					}
					//Output result
					System.out.println("Roll " + (i+1) + " is " + 
							rollTotal + " (" + die1 + 
							"+" + die2 + ")");
				}

				// Print statistics on dice rolls
				System.out.println("\nDice roll statistics:");
				System.out.println("2s: " + numTwos);
				System.out.println("3s: " + numThrees);
				System.out.println("4s: " + numFours);
				System.out.println("5s: " + numFives);
				System.out.println("6s: " + numSixes);
				System.out.println("7s: " + numSevens);
				System.out.println("8s: " + numEights);
				System.out.println("9s: " + numNines);
				System.out.println("10s: " + numTens);
				System.out.println("11s: " + numElevens);
				System.out.println("12s: " + numTwelves);

				//Histogram
				System.out.println("\nDice roll histogram for " + numRolls + " roll(s):");
				for (int j=0; j < numTwos; j++) {
					numTwoString += "*";
				}
				for (int j=0; j < numThrees; j++) {
					numThreeString += "*";
				}
				for (int j=0; j < numFours; j++) {
					numFourString += "*";
				}
				for (int j=0; j < numFives; j++) {
					numFiveString += "*";
				}
				for (int j=0; j < numSixes; j++) {
					numSixString += "*";
				}
				for (int j=0; j < numSevens; j++) {
					numSevenString += "*";
				}
				for (int j=0; j < numEights; j++) {
					numEightString += "*";
				}
				for (int j=0; j < numNines; j++) {
					numNineString += "*";
				}
				for (int j=0; j < numTens; j++) {
					numTenString += "*";
				}
				for (int j=0; j < numElevens; j++) {
					numElevenString += "*";
				}
				for (int j=0; j < numTwelves; j++) {
					numTwelveString += "*";
				}
				System.out.println("2:  " + numTwoString);
				System.out.println("3:  " + numThreeString);
				System.out.println("4:  " + numFourString);
				System.out.println("5:  " + numFiveString);
				System.out.println("6:  " + numSixString);
				System.out.println("7:  " + numSevenString);
				System.out.println("8:  " + numEightString);
				System.out.println("9:  " + numNineString);
				System.out.println("10: " + numTenString);
				System.out.println("11: " + numElevenString);
				System.out.println("12: " + numTwelveString + "\n");

				//Resets numbers
				numTwos = 0;     
				numThrees = 0;   
				numFours = 0;   
				numFives = 0;    
				numSixes = 0;    
				numSevens = 0;   
				numEights = 0;   
				numNines = 0;   
				numTens = 0;     
				numElevens = 0;  
				numTwelves = 0;  

				numTwoString = "";
				numThreeString = "";
				numFourString = "";
				numFiveString = "";
				numSixString = "";
				numSevenString = "";
				numEightString = "";
				numNineString = "";
				numTenString = "";
				numElevenString = "";
				numTwelveString = "";
			} 
			else if (numRolls == 0) {
				scnr.close();
				System.out.println("\nThank you for playing!");
				System.exit(0);
			}
			else {
				System.out.println("Invalid rolls. Try again.");
			}
		}


	}

}
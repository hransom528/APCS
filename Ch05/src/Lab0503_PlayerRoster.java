import java.util.Scanner;

public class Lab0503_PlayerRoster {

	public static void main(String[] args) {
		//Declares variables
		Scanner scnr = new Scanner(System.in);
		int[] jerseyNums = new int[5];
		int[] ratings = new int[5];
		int tempIndex, tempVal, tempVal2;
		boolean quit = false;
		char option;

		//Gets input
		for (int i = 1; i < 6; i++) {
			System.out.println("Enter player " + i + "'s jersey number:");
			jerseyNums[i - 1] = scnr.nextInt();
			System.out.println("Enter player " + i + "'s rating:");
			ratings[i - 1] = scnr.nextInt();
		}

		//Outputs starting roster
		System.out.println("\nROSTER");
		for (int j = 1; j < 6; j++) {
			System.out.println("Player " + j + " -- Jersey number: " + jerseyNums[j - 1] + ", Rating: " + ratings[j - 1]);
		}

		//Loops for menu 
		while (!quit) {
			//Menu
			System.out.println("MENU");
			System.out.println("u - Update player rating");
			System.out.println("a - Output players above a rating");
			System.out.println("r - Replace player");
			System.out.println("o - Output roster");
			System.out.println("q - Quit\n");
			System.out.println("Choose an option: ");
			option = scnr.next().charAt(0);

			if (option == 'u') {      //Updates player rating
				System.out.println("Enter a jersey number: ");
				tempIndex = scnr.nextInt();
				System.out.println("Enter a new rating for player: ");
				tempVal = scnr.nextInt(); 
				for (int i = 0; i < jerseyNums.length; i++) {
					if (jerseyNums[i] == tempIndex) {
						ratings[i] = tempVal; 
					}
				}
			}
			else if (option == 'a') { //Outputs players above a rating
				System.out.println("Enter rating: ");
				tempVal = scnr.nextInt();
				System.out.println("\nABOVE " + tempVal);
				for (int i = 1; i <= ratings.length; i++) {
					if (ratings[i - 1] > tempVal) {
						System.out.println("Player " + i + " -- Jersey number: " + jerseyNums[i - 1] + ", Rating: " + ratings[i - 1]);
					}
				}
			}
			else if (option == 'r') { //Replaces a player
				System.out.println("Enter a jersey number:");
				tempIndex = scnr.nextInt();
				if (tempIndex != -1) {
					for (int i = 0; i < jerseyNums.length; i++) {
						if (jerseyNums[i] == tempIndex) {
							System.out.println("Enter a new jersey number:");
							tempVal = scnr.nextInt(); 
							System.out.println("Enter a rating for the new player:");
							tempVal2 = scnr.nextInt();
							for (int j = 0; j < jerseyNums.length; j++) {
								if (jerseyNums[j]== tempIndex) {
									jerseyNums[j] = tempVal;
									ratings[j] = tempVal2; 
								}
							}
						}
					}
				}

			}
			else if (option == 'o') { //Outputs roster
				System.out.println("ROSTER");
				for (int j = 1; j < 6; j++) {
					System.out.println("Player " + j + " -- Jersey number: " + jerseyNums[j - 1] + ", Rating: " + ratings[j - 1]);
				}
			}
			else if (option == 'q') {
				quit = true;
				scnr.close();
				System.exit(0);
			}
			tempVal = 0;
			tempVal2 = 0;
			tempIndex = 0;
		}
	}
}

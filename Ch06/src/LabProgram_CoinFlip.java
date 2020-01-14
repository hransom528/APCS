import java.util.Scanner;
import java.util.Random;

public class LabProgram_CoinFlip {
	
	//Randomly flips coin
		public static String headsOrTails(Random rand) {
			String result = new String("");
			int num = rand.nextInt(2);
			
			if (num == 0) {
				result = "heads";
			}
			else {
				result = "tails";
			}
			return result;
		}
		
		//MAIN
		public static void main(String[] args) {
			//Declares variables 
			Scanner scnr = new Scanner(System.in);
			Random rand = new Random(2); // Unique seed
			int numTries;
			
			//Gets input
			numTries = scnr.nextInt();
			scnr.close();
			
			//Flips coin pseudo-randomly
			for (int i = 0; i < numTries; i++) {
				System.out.println(headsOrTails(rand));
			}
		}

}

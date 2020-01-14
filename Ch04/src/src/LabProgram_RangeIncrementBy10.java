package src;
import java.util.Scanner;

public class LabProgram_RangeIncrementBy10 {

	public static void main(String[] args) {
		//Declares scanner and vars
		Scanner scnr = new Scanner(System.in);
		int lowBound;
		int upBound;
		
		//Gets input
		lowBound = scnr.nextInt();
		upBound = scnr.nextInt();
		scnr.close();

		//Detects if range is valid
		if (upBound < lowBound) {
			System.out.println("Second integer can't be less than the first.");
			System.exit(0);
		}
		
		//Calculates numbers in range
		for (int i = lowBound; i <= upBound; i += 10) {
			System.out.print("" + i + " ");
		}
		System.out.print("\n");
	}

}

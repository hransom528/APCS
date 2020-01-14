package src;
import java.util.Scanner;

public class LabProgram_CountdownMatchDigits {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input; 
		int currentNum = 0;
		
		//Gets input
		input = scnr.nextInt(); 
		scnr.close();
		if ((input < 20) || (input > 98)) {
			System.out.println("Input must be 20-98");
		}
		else {
			currentNum = input;
			System.out.print("" + input + " ");
			while (currentNum % 11 != 0) {
				currentNum -= 1;
				System.out.print("" + currentNum + " ");
			}
			System.out.print("\n");
		}

	}

}

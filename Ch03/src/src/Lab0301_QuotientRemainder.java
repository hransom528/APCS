package src;
import java.util.Scanner;

public class Lab0301_QuotientRemainder {

	public static void main(String[] args) {
		//Sets up scanner and vars
		Scanner scnr = new Scanner(System.in);
		int num1, num2, division = 0, remainder = 0;
	
		//Gets values of two nums
		System.out.println("Please enter two numbers to divide:");
		System.out.print("First number: ");
		num1 = scnr.nextInt();
		System.out.print("Second number: ");
		num2 = scnr.nextInt();
		scnr.close();
		System.out.print("\n");
		
		//Does calculations
		if (num1 >= num2) {
			division = num1 / num2;
			remainder = num1 % num2;
		} 
		else if (num2 >= num1) {
			division = num2 / num1;
			remainder = num2 % num1;
		}
		
		//Outputs result
		System.out.println("The quotient is " + division + " and the remainder is " + remainder);
	}

}

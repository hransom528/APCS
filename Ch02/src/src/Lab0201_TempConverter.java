package src;
import java.util.Scanner;

public class Lab0201_TempConverter {

	public static void main(String[] args) {
		//Sets up scanner and vars
		Scanner scnr = new Scanner(System.in);
		double celsius, fahrenheit;
		
		//Gets input
		System.out.println("Enter the degrees in Fahrenheit: ");
		fahrenheit =  scnr.nextDouble();
		scnr.close();
		
		//Does calculations
		celsius = (5.0 / 9.0) * (fahrenheit - 32);
		
		//Outputs result
		System.out.println(fahrenheit + " F = " + celsius + " C.");
		
	}

}

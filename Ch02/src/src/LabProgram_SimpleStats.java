package src;
import java.util.Scanner;

public class LabProgram_SimpleStats {
	public static void main(String[] args) {
	
	//Part 1: Integer arithmetic
		//Declares vars and scanner
		Scanner scnr = new Scanner(System.in);
		int num1, num2, num3, product, average;

		//Gets integer input
		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
		num3 = scnr.nextInt();
		scnr.close();
		
		//Does calculations and displays 
		average = (num1 + num2 + num3) / 3;
		product = num1 * num2 * num3;
		System.out.println("" + average + " " + product);


	//Part 2: Floating-point arithmetic 
		//Declares floating-point vars
		double floatAvg, floatProduct;

		//Does math 
		floatAvg = (double) ((num1) + num2 + num3) / (double) 3;
		floatProduct = (double) num1 * num2 * num3;
		
		//Outputs formatted nums
		System.out.printf("%.2f", floatAvg);
		System.out.print(" ");
		System.out.printf("%.2f", floatProduct);
		System.out.print("\n");
	}

}

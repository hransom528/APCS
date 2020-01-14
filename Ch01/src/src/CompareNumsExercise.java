//Java exercise basics #32
package src;
import java.util.Scanner;

public class CompareNumsExercise {

	public static void main(String[] args) {
		//Gets input data
		Scanner scnr = new Scanner(System.in);
		int num1, num2;
		System.out.println("Input data: ");
		System.out.println("Input first number:  ");
		num1 = scnr.nextInt();
		System.out.println("Input second number: ");
		num2 = scnr.nextInt();
		scnr.close();
		
		//Compares nums
		if (num1 < num2) {
			System.out.println(num1 + " != " + num2);
			System.out.println(num1 + " < " + num2);
			System.out.println(num2 + " > " + num1);
		} else if (num2 < num1 ) {
			System.out.println(num2 + " != " + num1);
			System.out.println(num2 + " < " + num1);
			System.out.println(num1 + " > " + num2);
		} else if (num1 <= num2) {
			System.out.println(num1 + " != " + num2);
			System.out.println(num1 + " <= " + num2);
			System.out.println(num2 + " >= " + num1);
		} else if (num2 <= num1) {
			System.out.println(num2 + " != " + num1);
			System.out.println(num2 + " <= " + num1);
			System.out.println(num1 + " >= " + num2);
		} else {
			System.out.println(num1 + " == " + num2);		}
		
	}

}

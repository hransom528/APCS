package src;
import java.util.Scanner;

public class Lab0401_ApproxOfPi {

	public static void main(String[] args) {
		/* PART 1
		//Declares vars and scanner
		Scanner scnr = new Scanner(System.in);
		int iterations;
		int i = 1;
		int count = 0;
		int sign = 1;
		double piVal = 0;
		boolean plus = false;

		//Gets input
		System.out.println("How many iterations would you like to do: ");
		iterations = scnr.nextInt();
		scnr.close(); 

		//Calculates pi
		while (count < iterations) { 
			piVal = piVal + ((double) sign / i);
			sign *= -1;
			i += 2;
			count += 1;
		}
		piVal *= 4.0;
		System.out.println("pi = " + piVal);
		 */

		//PART 2 and PART 3 

		//Declares vars and scnr
		Scanner scnr = new Scanner(System.in);
		double threshold = 0;
		double piVal = 0;
		char loopChar = 'y'; 
		int i = 1;
		int sign = 1;
		int count = 0;

		//Loops until user exits
		while (loopChar != 'n') {
			//Resets values 
			threshold = 0;
			piVal     = 0;
			i         = 1;
			sign      = 1;
			count     = 0;

			//Gets input
			System.out.println("What is the threshold you wish to use (.1 or less): ");
			threshold = scnr.nextDouble();
			while (threshold > .1) { 
				System.out.println("What is the threshold you wish to use (.1 or less): ");
				threshold = scnr.nextDouble();
			}

			//Calculates pi
			while (Math.abs((piVal * 4.0) - (Math.PI)) > threshold) {
				piVal += ((double) sign / i);
				sign *= -1;
				i += 2;
				count += 1;
			}
			piVal *= 4.0;

			//Outputs
			System.out.println("Math.PI:\t" + Math.PI);
			System.out.println("pi:     \t" + piVal);
			System.out.println("Number of iterations: " + count);

			//Loops
			System.out.println("Would you like to enter another threshold (y/n):");
			loopChar = scnr.next().charAt(0);
		}
		System.out.println("Thank you for Approximating Pi.");
		scnr.close();
	}

}

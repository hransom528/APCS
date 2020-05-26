import java.util.Scanner;

public class NumberPattern {
	//MAIN
	public static void main(String[] args) { 
		Scanner scnr = new Scanner(System.in);
		int num1, num2;
		
		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
		printNumPattern(num1, num2); 
		scnr.close();
	}

	//Recursive method
	public static void printNumPattern(int num, int sub) {
		if (num <= 0) { //Base case
			System.out.print(num + " ");
			return; //Traverses back up the stack, recalling past recursive calls
		}
		else { 
			System.out.print(num + " "); //Outputs num before
			printNumPattern(num - sub, sub); 
			System.out.print(num + " "); //Outputs num after
		}
	} 
} 
package src;
import java.util.Scanner;

public class LabProgram_LargestNum {

	public static void main(String[] args) {
		//Variable and scnr declarations
		Scanner scnr = new Scanner(System.in);
		int num1, num2, num3;
		
		//Gets nums
		num1 = scnr.nextInt();
		num2 = scnr.nextInt();
		num3 = scnr.nextInt();
		scnr.close();
		
		//Tests nums
		if ((num1 >= num2) && (num1 >= num3)) {
			System.out.println(num1);
		}
		else if ((num2 >= num1) && (num2 >= num3)) {
			System.out.println(num2);
		}
		else if ((num3 >= num1) && (num3 >= num2)) {
			System.out.println(num3);
		}
		else {
			System.out.println("Error!");
		}
	}

}

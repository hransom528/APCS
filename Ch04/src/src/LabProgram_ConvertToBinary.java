package src;
import java.util.Scanner;

public class LabProgram_ConvertToBinary {

	public static void main(String[] args) {
		//Declares vars and scnr
		Scanner scnr = new Scanner(System.in);
		int x;

		//Gets input
		x = scnr.nextInt();
		scnr.close();

		//Converts int to binary
		while (x > 0) {
			System.out.print(x % 2);
			x /= 2;
		}
		System.out.print("\n");
	}

}

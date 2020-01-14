package src;
import java.util.Scanner;

public class LabProgram_DivideByX {

	public static void main(String[] args) {
		//Declares scanner and vars
		Scanner scnr = new Scanner(System.in);
		int userNum, x;

		//Gets input
		userNum = scnr.nextInt();
		x = scnr.nextInt();
		scnr.close();
		
		//Divides and outputs
		userNum /= x;  //First division
		System.out.print("" + userNum + " ");
		userNum /= x;  //Second division
		System.out.print("" + userNum + " ");
		userNum /= x;  //Third division
		System.out.print("" + userNum + " ");
		userNum /= x;  //Fourth division
		System.out.println("" + userNum);
	}

}

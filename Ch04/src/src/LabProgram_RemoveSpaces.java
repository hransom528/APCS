package src;
import java.util.Scanner;

public class LabProgram_RemoveSpaces {

	public static void main(String[] args) {
		//Declares scnr and vars
		Scanner scnr = new Scanner(System.in);
		String inputString = "";
		String newString   = "";

		//Gets input
		inputString = scnr.nextLine();
		scnr.close();
		
		//Removes spaces
		newString = inputString.replaceAll(" ", "");
		System.out.println(newString);
	}

}

package src;
import java.util.ArrayList;
import java.util.Scanner;

public class LabProgram_ReverseString {

	public static void main(String[] args) {
		//Declares scanner and vars
		Scanner scnr = new Scanner(System.in);
		ArrayList<String>inputStrings = new ArrayList<String>();
		ArrayList<String>outputStrings = new ArrayList<String>();
		boolean quit = false;
		int i = 0;
		
		//Gets input
		while (!quit) {
			inputStrings.add(scnr.nextLine());
			if ((inputStrings.get(i).equalsIgnoreCase("quit")) || (inputStrings.get(i).equalsIgnoreCase("q"))) {
				inputStrings.remove(inputStrings.size() - 1);
				quit = true;
				break;
			}
			i += 1;
		}
		scnr.close();
		
		//Reverses strings
		for (int j = 0; j <= (inputStrings.size() - 1); j++) {
			outputStrings.add(new StringBuilder(inputStrings.get(j)).reverse().toString());
			System.out.println(outputStrings.get(j));
		}	
	}
}

package src;
import java.util.Scanner;

public class Lab0304_TextMsgAbbreviation {

	public static void main(String[] args) {
		//Declares scanner and variables
		Scanner scnr = new Scanner(System.in);
		String s;

		//Gets input s
		System.out.println("Input an abbreviation:");
		s = scnr.nextLine();
		scnr.close();

		//Tests string
		if (s.equals("LOL")) {
			System.out.println("laughing out loud");
		} 
		else if (s.equals("BFF")) {
			System.out.println("best friends forever");
		}
		else if (s.equals("IMHO")) {
			System.out.println("in my humble opinion");
		}
		else if (s.equals("TMI")) {
			System.out.println("too much information");
		}
		else if (s.equals("IDK")) {
			System.out.println("I don't know");
		}
		else {
			System.out.println("Unknown");
		}
	}

}

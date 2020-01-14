package src;
import java.util.Scanner;

public class Lab0306_TextMsgExpander {

	public static void main(String[] args) {
		//Declares scanner and vars
		Scanner scnr = new Scanner(System.in);
		String inputString = "";
		String newString = "";
		
		String bffString = "BFF";
		String idkString = "IDK";
		String jkString = "JK";
		String tmiString = "TMI";
		String ttylString = "TTYL";
		
		int bffIndex;
		int idkIndex;
		int jkIndex;
		int tmiIndex;
		int ttylIndex;

		//Gets input and outputs
		System.out.println("Enter text: ");
		inputString = scnr.nextLine();
		newString = inputString;
		scnr.close();
		System.out.println("You entered: " + inputString + "\n");

		//Searches string
		bffIndex = inputString.indexOf(bffString); //Gets index of any LOL's
		idkIndex = inputString.indexOf(idkString); //Gets index of any IDK's
		jkIndex = inputString.indexOf(jkString); //Gets index of any JK's
		tmiIndex = inputString.indexOf(tmiString); //Gets index of any TMI's
		ttylIndex = inputString.indexOf(ttylString); //Gets index of any TTYL's
		
		//Replaces strings
		if (bffIndex != -1) {
			System.out.println("Replaced \"BFF\" with \"best friend forever\".");
			newString = newString.replace("BFF", "best friend forever");
		} 
		if (idkIndex != -1) {
			System.out.println("Replaced \"IDK\" with \"I don't know\".");
			newString = newString.replace("IDK", "I don't know");
		}
		if (jkIndex != -1) {
			System.out.println("Replaced \"JK\" with \"just kidding\".");
			newString = newString.replace("JK", "just kidding");
		}
		if (tmiIndex != -1) {
			System.out.println("Replaced \"TMI\" with \"too much information\".");
			newString = newString.replace("TMI", "too much information");
		}
		if (ttylIndex != -1) {
			System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
			newString = newString.replace("TTYL", "talk to you later");
		}
		
		//Outputs expanded string
		System.out.println("\nExpanded: " + newString);
	}

}

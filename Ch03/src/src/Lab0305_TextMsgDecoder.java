package src;
import java.util.Scanner;

public class Lab0305_TextMsgDecoder {

	public static void main(String[] args) {
		//Declares scanner and vars
		Scanner scnr = new Scanner(System.in);
		String inputString = "";

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
		scnr.close();
		System.out.println("You entered: " + inputString);

		//Searches string
		bffIndex = inputString.indexOf(bffString); //Gets index of any LOL's
		idkIndex = inputString.indexOf(idkString); //Gets index of any IDK's
		jkIndex = inputString.indexOf(jkString); //Gets index of any JK's
		tmiIndex = inputString.indexOf(tmiString); //Gets index of any TMI's
		ttylIndex = inputString.indexOf(ttylString); //Gets index of any TTYL's

		if (bffIndex != -1) {
			System.out.println("BFF: best friend forever");
		} 
		if (idkIndex != -1) {
			System.out.println("IDK: I don't know");
		}
		if (jkIndex != -1) {
			System.out.println("JK: just kidding");
		}
		if (tmiIndex != -1) {
			System.out.println("TMI: too much information");
		}
		if (ttylIndex != -1) {
			System.out.println("TTYL: talk to you later");
		}

	}

}

import java.util.Scanner;

public class TextAnalyzer {

	public static void main(String[] args) {
		//Declares variables
		Scanner scnr = new Scanner(System.in);
		String inputString = "", stringNoWhite = "";
		int numChars = 0; 

		//Gets input 
		System.out.println("Enter a sentence or phrase:");
		inputString = scnr.nextLine();
		System.out.println("\nYou entered: " + inputString);
		scnr.close();

		//Gets number of characters in string 
		numChars = getNumOfCharacters(inputString);

		//Gets string with no whitespace
		stringNoWhite = outputWithoutWhitespace(inputString);
		
		//Outputs 
		System.out.println("\nNumber of characters: " + numChars);
		System.out.println("String with no whitespace: " + stringNoWhite);
	}

	// Method counts the number of characters
	public static int getNumOfCharacters(String userStr) {
		int length = 0;
		for (int i = 0; i < userStr.length(); i++) {
			length += 1;
		}
		return length;
	}
	
	//Method that returns a string without any whitespace characters 
	public static String outputWithoutWhitespace(String inString) {
		String outString = ""; 
		outString = inString.replaceAll(" ", "");
		return outString;
	}

}

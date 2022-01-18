import java.util.Scanner;

public class Lab0602_AuthoringAssistant {
	static boolean quit = false;
	static char userChar;

	// Outputs menu and gets user option 
	public static char printMenu(Scanner scanObj) {
		boolean quitLoop = false;

		// Outputs menu
		System.out.println("MENU");
		System.out.println("c - Number of non-whitespace characters");
		System.out.println("w - Number of words");
		System.out.println("f - Find text");
		System.out.println("r - Replace all !'s");
		System.out.println("s - Shorten spaces");
		System.out.println("q - Quit");
		System.out.println("\nChoose an option:");

		// Gets menu selection
		userChar = scanObj.next().charAt(0);
		if((userChar != 'c') && (userChar != 'w') && (userChar != 'f') && (userChar != 'r') && (userChar != 's') && (userChar != 'q')) {
			while (!quitLoop) {
				System.out.println("Choose an option:");
				userChar = scanObj.next().charAt(0);
				if((userChar == 'c') || (userChar == 'w') || (userChar == 'f') || (userChar == 'r') || (userChar == 's') || (userChar == 'q')) {
					quitLoop = true;
				}
			}
		}
		
		return userChar;
	}

	// Quits the program 
	public static void quit(Scanner scanObj) {
		System.out.print("\n");
		scanObj.close();
		System.exit(0);
	}

	// Gets amount of non-whitespace characters 
	public static int getNumOfNonWSCharacters(String usrString) {
		int numNonWS = 0;
		// Loops through and counts any non whitespace chars
		for (int i = 0; i < usrString.length(); i++) {
			if (usrString.charAt(i) != ' ') {
				numNonWS += 1;
			}
		}
		return numNonWS;
	}

	// Gets number of words in string
	public static int getNumOfWords(String usrString) {
		int numWords = 0;
		char[] chars = usrString.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if ((chars[i] == ' ') && !(chars[i+1] == ' ')) {
				numWords += 1;
			}
		}
		
		return numWords++; 
	}

	// Finds a string in a piece of text
	public static int findText(String searchString, String sampleText) {
		int count = 0;
		int index = 0; 

		if (sampleText.indexOf(searchString) == -1) {
			return 0;
		}
		else {
			for (int searchIndex = 0; searchIndex < sampleText.length() - 1; searchIndex += searchString.length()) {
				index = sampleText.indexOf(searchString, searchIndex);	
				if (index != -1) {
					count++;
				}
				searchIndex = index;
			}
		}
		return count;
	}

	// Replaces all !'s in a string 
	public static String replaceExclamation(String usrString) {
		return usrString.replaceAll("!", ".");
	}

	// Shortens "  " to " " in a string
	public static String shortenSpace(String usrString) {
		return usrString.replaceAll("  ", " ");
	}

	// MAIN
	public static void main(String[] args) {
		// Declares variables 
		Scanner scnr = new Scanner(System.in);
		String inputString = "";
		String searchString = "";
		int occurences;

		// Gets input 
		System.out.println("Enter a sample text:");
		inputString = scnr.nextLine();
		System.out.print("\nYou entered: ");
		System.out.println(inputString);

		// Calls methods that user selects
		while (!quit) {
			userChar = printMenu(scnr);

			if (userChar == 'c') { 
				System.out.println("Number of non-whitespace characters: " + getNumOfNonWSCharacters(inputString));
			}
			else if (userChar == 'w') {
				System.out.println("\nNumber of words: " + getNumOfWords(inputString));
			}
			else if (userChar == 'f') {
				System.out.println("\nEnter a word or phrase to be found:");
				scnr.nextLine();
				searchString = scnr.nextLine();
				occurences = findText(searchString, inputString);
				System.out.println("\"" + searchString + "\" instances: " + occurences);
			}
			else if (userChar == 'r') {
				System.out.println("Edited text: " + replaceExclamation(inputString));
			}
			else if (userChar == 's') {
				System.out.println("Edited text: " + shortenSpace(inputString));
			}
			else if (userChar == 'q') {
				quit = true;
				quit(scnr);
			}
			else {
				System.out.println("Error!");
			}
			
			searchString = "";
			occurences = 0;
		}
		
		System.exit(0);
	}
}

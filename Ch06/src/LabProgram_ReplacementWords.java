import java.util.Scanner;

public class LabProgram_ReplacementWords  {
	//Locates a word in a word list
	public static int findWordInWordList(String[] wordList, String wordToFind, int numInList) {
		int index = -1;
		for (int i = numInList; i < wordList.length; i++) {
			if (wordList[i].equalsIgnoreCase(wordToFind)) {
				index = i;
				break;
			}
		}
		return index;
	}

	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int wordPairs = scnr.nextInt();
		int inputLength;
		String[] wordsToFind = new String[wordPairs];
		String[] wordReplaces = new String[wordPairs];
		String[] input;

		//Gets input
		for (int i = 0; i < wordPairs; i++) { //Replacement words and words to find
			wordsToFind[i] = scnr.next();
			wordReplaces[i] = scnr.next(); 
		}

		inputLength = scnr.nextInt();   	 //Full list of words
		input = new String[inputLength];
		for (int i = 0; i < inputLength; i++) {
			input[i] = scnr.next(); 
		}
		scnr.close();

		//Replaces words
		for (int i = 0; i < wordsToFind.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (findWordInWordList(input, wordsToFind[i], j) != -1) {
					input[findWordInWordList(input, wordsToFind[i], j)] = wordReplaces[i];
				}
			}
		}

		//Outputs array
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.print("\n");
	}
}
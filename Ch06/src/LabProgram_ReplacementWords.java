import java.util.Scanner;

public class LabProgram_ReplacementWords  {
	//Locates a word in a word list
	public static int findWordInWordList(String[] wordList, String wordToFind, int numInList) {
		int index = -1;
		for (int i = 0; i < wordList.length; i++) {
			if (wordList[i].equalsIgnoreCase(wordToFind)) {
				index = i;
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
		for (int i = 0; i < wordPairs; i++) {
			wordsToFind[i] = scnr.next();
			wordReplaces[i] = scnr.next(); 
		}
		
		inputLength = scnr.nextInt();
		input = new String[inputLength];
		for (int i = 0; i < inputLength; i++) {
			input[i] = scnr.next(); 
		}
		scnr.close();
	
		//Replaces words
		for (int i = 0; i < wordsToFind.length; i++) {
			if (findWordInWordList(input, wordsToFind[i], i) != -1) {
				input[findWordInWordList(input, wordsToFind[i], i)] = wordReplaces[i]; //FIXME: Word replacer
			}
		}
		
		//Outputs array
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
	}

}
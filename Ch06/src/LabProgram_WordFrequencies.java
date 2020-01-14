import java.util.Scanner;

public class LabProgram_WordFrequencies {
	//Gets frequencies of a word in a String array
	public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord) {
		int wordFreq = 0;
		for (int i = 0; i < listSize; i++) {
			if (wordsList[i].equals(currWord)) {
				wordFreq += 1;
			}
		}
		return wordFreq;
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int size = scnr.nextInt();
		String[] input = new String[size];
		int[] freqs = new int[size];
		
		//Gets input
		for (int i = 0; i < input.length; i++) {
			input[i] = scnr.next(); 
		}
		scnr.close();
		
		//Gets the frequencies of the words
		for (int i = 0; i < input.length; i++) {
			freqs[i] = getFrequencyOfWord(input, size, input[i]);
		}
		
		//Outputs results
		for (int i = 0; i < input.length; i++) {
			System.out.println("" + input[i] + " " + freqs[i]);
		}
	}
}
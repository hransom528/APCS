import java.util.Scanner;

public class LabProgram_Convert2BinaryWithMethods {

	//Converts an integer to a binary string in reverse order
	public static String integerToReverseBinary(int integerValue) {
		String binaryString = "";
		while (integerValue > 0) {
			binaryString += (integerValue % 2);
			integerValue /= 2;
		}
		return binaryString;
	}
	
	//Uses StringBuilder to reverse a string 
	public static String reverseString(String inputString) {
		StringBuilder builder = new StringBuilder();
		
		builder.append(inputString);
		builder = builder.reverse();
		
		return builder.toString();
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int input = scnr.nextInt(); scnr.close(); //Gets input 
		String outputString;
		
		//Calculates and outputs binary string
		outputString = integerToReverseBinary(input);
		outputString = reverseString(outputString);
		System.out.println(outputString);

	}

}

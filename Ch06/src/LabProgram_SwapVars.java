import java.util.Scanner;

public class LabProgram_SwapVars {

	public static void swapValues(int[] values) {
		int x = values[0];
		int y = values[1];
		int temp = values[0];
		
		//Swaps using temp value
		x = y;
		y = temp;
		
		//Stores to array
		values[0] = x;
		values[1] = y;
		
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int[] input = new int[2];
		
		//Gets input
		for (int i = 0; i < input.length; i++) {
			input[i] = scnr.nextInt(); 
		}
		scnr.close();
		
		//Swaps values
		swapValues(input);

		//Outputs values
		System.out.print(input[0] + " ");
		System.out.println(input[1]);
	}

}
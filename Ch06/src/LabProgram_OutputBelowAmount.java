import java.util.Scanner;

public class LabProgram_OutputBelowAmount {
	//Gets user input and stores in array
	public static void getUserValues(int[] myArr, int arrSize, Scanner scnr) {
		for (int i = 0; i < arrSize; i++) {
			myArr[i] = scnr.nextInt(); 
		}
	}
	
	//Outputs values in array below a threshold
	public static void outputIntsLessThanOrEqualToThreshold(int[] userValues, int userValsSize, int upperThreshold) {
		for (int i = 0; i < userValues.length; i++) {
			if (userValues[i] <= upperThreshold) {
				System.out.print(userValues[i] + " ");
			}
		}
		System.out.println();
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int arrSize = scnr.nextInt();
		int[] nums = new int[arrSize];
		int threshold;
		
		//Gets input
		getUserValues(nums, arrSize, scnr);
		threshold = scnr.nextInt();
		scnr.close();

		//Outputs values below the threshold
		outputIntsLessThanOrEqualToThreshold(nums, arrSize, threshold);
	}

}
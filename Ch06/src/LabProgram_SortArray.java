import java.util.Scanner;

public class LabProgram_SortArray {
	
	//Sorts array
	public static void sortArray(int[] myArr, int arrSize) {
		int i = 1;
		int j = 1;
		int tempVar;
		
		while (i < arrSize) {
			j = i;
			while ((j > 0) && (myArr[j - 1] > myArr[j])) {
				//Swaps values
				tempVar = myArr[j];
				myArr[j] = myArr[j - 1];
				myArr[j - 1] = tempVar;
				j -= 1;
			}
			i += 1;
		}
	}
	
	//MAIN
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int arrSize = scnr.nextInt();
		int[] nums = new int[arrSize];
		
		//Gets input
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scnr.nextInt(); 
		}
		scnr.close();

		//Sorts array
		sortArray(nums, arrSize);
		
		//Outputs array
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

}
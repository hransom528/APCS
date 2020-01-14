import java.util.Scanner;

public class LabProgram_TwoSmallestNums {

	public static void main(String[] args) {
		//Declares variables
		Scanner scnr = new Scanner(System.in);
		int[] nums;
		int smallest, secondSmallest;
		int count = 0; 

		//Gets input
		count = scnr.nextInt();
		nums = new int[count];
		for (int i = 0; i < count; i++) {
			nums[i] = scnr.nextInt();
		}
		smallest = nums[0];
		secondSmallest = nums[1];
		scnr.close();
		
		//Sorts 
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] <= smallest) {
					smallest = nums[i]; 
				}
				else if ((nums[i] > smallest) && (nums[i] <= secondSmallest)) {
					secondSmallest = nums[i]; 
				}
			}
		}

		//Outputs smallest values
		System.out.print("" + smallest + " ");
		System.out.println("" + secondSmallest);
	}

}

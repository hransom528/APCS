import java.util.Scanner;

public class LabProgram_ElementsInRange {

	public static void main(String[] args) {
		//Declares variables
		Scanner scnr = new Scanner(System.in);
		int[] nums;
		int upBound, lowBound;
		
		//Gets input
		nums = new int[scnr.nextInt()]; //Gets array size
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scnr.nextInt();   //Gets nums in array
		}
		lowBound = scnr.nextInt();       //Gets upper bound
		upBound = scnr.nextInt();      //Gets lower bound
		scnr.close();
		
		//Gets nums in range
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] >= lowBound) && (nums[i] <= upBound)) {
				System.out.print("" + nums[i] + " ");
			}
		} 
		System.out.print('\n');
	}

}

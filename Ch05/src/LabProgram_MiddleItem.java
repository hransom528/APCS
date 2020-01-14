import java.util.Scanner;

public class LabProgram_MiddleItem {

	public static void main(String[] args) {
		//Declares variables
		Scanner scnr = new Scanner(System.in);
		int[] nums = new int[9];
		int middleNum, nextInput, middleIndex;
		int currIndex = 0, itemCount = 0;
		boolean quitLoop = false;
		
		//Gets input
		while (!quitLoop) {
			nextInput = scnr.nextInt();
			if (nextInput < 0) {
				quitLoop = true;
			}
			else if (currIndex > 8) {
				System.out.println("Too many inputs");
				quitLoop = true;
				scnr.close();
				System.exit(0);
			}
			else {
				nums[currIndex] = nextInput;
				currIndex++;
				itemCount++;
			}
		}
		scnr.close();
		
		//Finds middle num
		middleIndex = (int) Math.ceil((itemCount - 1) / 2.0);
		middleNum = nums[middleIndex];
		System.out.println(middleNum);
	}

}

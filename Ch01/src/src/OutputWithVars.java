package src;
import java.util.Scanner; 

public class OutputWithVars {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;
		System.out.println("Enter integer:");
		userNum = scnr.nextInt();  

		int squaredNum = userNum * userNum;
		int cubedNum = (userNum * userNum) * userNum;
		System.out.println("You entered: " + userNum);
		System.out.println(userNum + " squared is " + squaredNum);
		System.out.println("And " + userNum + " cubed is " + cubedNum + "!!");
		
		System.out.println("Enter another integer:");
		int userNum2 = scnr.nextInt();
		scnr.close();
		int addedNums = userNum + userNum2;
		int multNums = userNum * userNum2;
		System.out.println(userNum + " + " + userNum2 + " is " + addedNums);
		System.out.println(userNum + " * " + userNum2 + " is " + multNums);
	}

}

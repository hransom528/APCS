import java.util.Scanner;

public class NumberPattern {
   public static void printNumPattern(int high, int increment) {
	   int currNum = high;
	   
	}
  
   public static void main(String[] args) { 
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      scnr.close();
      printNumPattern(num1, num2); 
   } 
} 
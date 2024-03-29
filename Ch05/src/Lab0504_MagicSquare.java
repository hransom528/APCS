import java.util.Scanner;

public class Lab0504_MagicSquare {

	public static void main(String[] args) {
		//Declares variables and scanner 
		Scanner scnr = new Scanner(System.in);
		int[][] square = new int[4][4]; 
		int[] rows = new int[4];
		int[] cols = new int[4];
		
		int diagonalSum1 = 0;
		int diagonalSum2 = 0;
		boolean isMagic = true;
		
		//Gets values for square
		for (int r = 1; r <= rows.length; r++) { //Every row
			for (int c = 1; c <= cols.length; c++) { //Every column in the row  
				System.out.println("Row " + r + ", Col " + c + ": ");
				square[r-1][c-1] = scnr.nextInt();
			}
		}
		scnr.close();
		
		//Calculates sums for rows 
		for (int r = 0; r < rows.length; r++) { 
			for (int c = 0; c < cols.length; c++) { 
				rows[r] += square[r][c];
			}
		}
		
		//Calculates sums for columns 
		for (int c = 0; c < cols.length; c++) { 
			for (int r = 0; r < rows.length; r++) { 
				cols[c] += square[r][c]; 
			}
		}
		
		//Calculates diagonals
		for (int c = 0; c < cols.length; c++) {
			diagonalSum1 += square[c][c];
		}
		int tempDiagonal = 0; //For calculating rows on the backwards diagonal
		for (int i = 3; i >= 0; i--) {
			diagonalSum2 += square[i][tempDiagonal]; 
			tempDiagonal += 1;
		}
		
		//Detects if square is a magic square
		for (int i = 0; i < cols.length; i++) {
			if (!((cols[i] == rows[i]) && (diagonalSum1 == diagonalSum2) && (diagonalSum1 == cols[i]) && (diagonalSum1 == rows[i]))) {
				isMagic = false;
			}
		}
		
		//Outputs if the square is magic or not
		if (isMagic) {
			System.out.println("\nIt is a Magic Square!");
		}
		else {
			System.out.println("\nIt is NOT a Magic Square!");
		}
		
	}

}
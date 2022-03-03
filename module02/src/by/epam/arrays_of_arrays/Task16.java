package by.epam.arrays_of_arrays;

import java.util.Arrays;

public class Task16 {
	// 16. Построить магический квадрат.

	public static void main(String[] args) {
		int[][] magicSquare = createMagicSquare();
		
		for(int i = 0; i < magicSquare.length; i++) {
			System.out.println(Arrays.toString(magicSquare[i]));
		}
	}
	
	public static int[][] createMagicSquare(){    // магический квадрат 3*3
		int n = 3;
		int[][] magicSquare = new int[n][n];
	
		int number = 1;
		int row = 0;
		int column = n / 2;
		int curr_row;
		int curr_col;
		
		while (number <= n * n) {
			magicSquare[row][column] = number;
			number++;
			
			curr_row = row;
			curr_col = column;
			row -= 1;
			column += 1;
			
			if (row == -1) {
				row = n - 1;
			}
			
			if (column == n) {
				column = 0;
			}
			
			if (magicSquare[row][column] != 0) {
				
					row = curr_row + 1;
					column = curr_col;
			}
		}
		return magicSquare;
	}
	

}

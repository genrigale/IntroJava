package by.epam.arrays_of_arrays;

import java.util.Arrays;

public class Task14 {
//	14. Сформировать случайную матрицу m*n, состоящую из нулей и единиц, причем в каждом столбце число 
//	единиц равно номеру столбца.

	public static void main(String[] args) {
		int m = 3; // число строк
		int n = 4; // число столбцов

		int[][] a = new int[m][n];

		System.out.println("Исходная матрица: ");
		for (int i = 0; i < m; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		
		///////////////////////////////////////////////////////////////////
		for (int j = 1; j < a[0].length; j++) {
			for (int i = 0; i < a.length; i++) {
				for (; i < j; i++) {    			// заполнение столбцов единицами
					a[i][j] = 1;
				}
			}
		}
		///////////////////////////////////////////////////////////////////

		System.out.println();

		System.out.println("Результат: ");
		for (int i = 0; i < m; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

	}
}

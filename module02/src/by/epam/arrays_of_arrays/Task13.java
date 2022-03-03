package by.epam.arrays_of_arrays;

import java.util.Arrays;

public class Task13 {
//	13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

	public static void main(String[] args) {
		int[][] a = { { 3, 5, 2 }, { 1, 7, 6 }, { 9, 2, 4 } };

		System.out.println("Исходная матрица: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

		//////////////////////////////////////////////////////////////////////////////
		for (int j = 0; j < a[0].length; j++) {
			for (int i = 0; i < a.length - 1; i++) {
				for (int k = i + 1; k < a.length; k++) {
					if (a[i][j] > a[k][j]) {
						int temp = a[i][j];					
						a[i][j] = a[k][j];					// сортировка столбцов по возрастанию
						a[k][j] = temp;
					}
				}
			}
		}
		//////////////////////////////////////////////////////////////////////////////

		System.out.println();

		System.out.println("Столбцы по возрастанию: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

		System.out.println();

		//////////////////////////////////////////////////////////////////////////////
		for (int j = 0; j < a[0].length; j++) {
			for (int i = 0; i < a.length - 1; i++) {
				for (int k = i + 1; k < a.length; k++) {
					if (a[i][j] < a[k][j]) {
						int temp = a[i][j];
						a[i][j] = a[k][j];					// сортировка столбцов по убыванию
						a[k][j] = temp;
					}
				}
			}
		}
		//////////////////////////////////////////////////////////////////////////////

		System.out.println();

		System.out.println("Столбцы по убыванию: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

	}

}

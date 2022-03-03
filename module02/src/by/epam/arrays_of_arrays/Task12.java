package by.epam.arrays_of_arrays;

import java.util.Arrays;

public class Task12 {
//	12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов. 

	public static void main(String[] args) {
		int[][] a = { { 1, 5, 2 }, { 3, 7, 6 }, { 9, 2, 4 } };

		System.out.println("Исходная матрица: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

		System.out.println();

		System.out.println("Строки по возрастанию: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				for (int k = j + 1; k < a[i].length; k++) {
					if (a[i][j] > a[i][k]) {
						int temp = a[i][j];
						a[i][j] = a[i][k];
						a[i][k] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(a[i]));
		}

		System.out.println();

		System.out.println("Строки по убыванию: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length - 1; j++) {
				for (int k = j + 1; k < a[i].length; k++) {
					if (a[i][j] < a[i][k]) {
						int temp = a[i][j];
						a[i][j] = a[i][k];
						a[i][k] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(a[i]));
		}

	}

}

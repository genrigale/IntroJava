package by.epam.arrays_of_arrays;

import java.util.Arrays;

public class Task09 {

	// 09. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
	// столбце. Определить, какой столбец содержит максимальную сумму.
	public static void main(String[] args) {
		int[][] a = new int[][] { { 1, 2, 3 }, { 4, 9, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

		int maxSum = 0;
		int index = -1;

		for (int j = 0; j < a[0].length; j++) {
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum += a[i][j];
			}

			if (sum > maxSum) {
				maxSum = sum;
				index = j;
			}
		}

		System.out.println("Максимальная сумма = " + maxSum + ". Индекс столбца: " + index + ".");

	}

}

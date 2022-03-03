package by.epam.arrays_of_arrays;

import java.util.Arrays;

public class Task07 {
	// 07. Сформировать квадратную матрицу порядка n по правилу:
	// a[i][j] = sin((i^2 - j^2) / n).
	// Посчитать количество положительных элементов в ней.

	public static void main(String[] args) {

		int n = 4;
		double[][] a = new double[n][n];

		int countPositive = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = Math.sin((i * i - j * j) / n);
			}
			System.out.println(Arrays.toString(a[i]));
		}

		System.out.println();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] > 0) {
					countPositive++;
				}
			}
		}

		
		System.out.println("Количество положительных элементов = " + countPositive);

	}

}

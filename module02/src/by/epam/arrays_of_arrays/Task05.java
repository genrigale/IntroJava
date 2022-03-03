package by.epam.arrays_of_arrays;

import java.util.Scanner;

public class Task05 {
	// 05. Сформировать квадратную матрицу порядка n по заданному образцу. n -
	// четное число.

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите n: ");
		int n = scanner.nextInt();
		
		scanner.close();
		
		if(n % 2 != 0) {
			System.out.println("Число n должно быть четным! Введите новое значение.");
			return;
		}
		
		int[][] array = new int[n][n];

		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n - count) {
					for (; j < n; j++) {
						array[i][j] = 0;
					}
				} else
					array[i][j] = i + 1;
			}
			count++;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}
}

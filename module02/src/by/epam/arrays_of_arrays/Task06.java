package by.epam.arrays_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
	// 06. Сформировать квадратную матрицу порядка n по заданному образцу. n -
	// четное число.

	public static void main(String[] args) {
		System.out.println("Введите n: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		scanner.close();

		if (n % 2 != 0) {
			System.out.println("Число n должно быть четным! Введите новое значение.");
			return;
		}

		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n - i; j++) {
				arr[i][j] = 1;
				arr[n - i - 1][j] = 1;
			}
			System.out.println(Arrays.toString(arr[i]));
		}

	}
}
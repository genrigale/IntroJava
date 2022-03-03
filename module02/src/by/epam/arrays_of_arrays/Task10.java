package by.epam.arrays_of_arrays;

import java.util.Arrays;

public class Task10 {
	//	10. Найти положительные элементы главной диагонали квадратной матрицы. 

	public static void main(String[] args) {
		int[][] a = { { 1, 5, 2 }, { 0, 3, 6 }, { 9, 2, -4 } };

		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

		System.out.println();

		System.out.println("Элементы главной диагонали: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i][i] + " ");
		}

		System.out.println();

		System.out.println("Положительные элементы главной диагонали: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i][i] > 0) {
				System.out.print(a[i][i] + " ");
			}

		}

	}

}

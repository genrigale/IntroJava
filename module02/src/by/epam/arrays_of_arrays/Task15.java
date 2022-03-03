package by.epam.arrays_of_arrays;

import java.util.Arrays;

public class Task15 {
//	15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него. 


	public static void main(String[] args) {
		int[][] a = { { 3, 5, 2 }, { 1, 7, 6 }, { 9, 2, 4 } };

		System.out.println("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

		// поиск наибольшего элемента
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}

		// замена нечетных элементов на максимальный элемент
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 != 0) {
					a[i][j] = max;
				}
			}
		}

		System.out.println();
		System.out.println("Наибольший элемент: " + max + ".");
		System.out.println();
		
		System.out.println("Результат: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

}

package by.epam.one_dimentional_arrays_sorting;

import java.util.Arrays;

public class Task06 {
	// 06. Сортировка Шелла.
	// Дана последовательность действительных чисел.
	// Упорядочить её по возрастанию.

	public static void main(String[] args) {
		double[] array = { 2, -1, -4, 3.33, 7.1, 9.4, -11, 6.3 };
		System.out.println("Исходный массив: " + Arrays.toString(array));

		for (int step = array.length / 2; step > 0; step /= 2) {
			for (int i = step; i < array.length; i++) {
				for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
					double temp = array[j];
					array[j] = array[j + step];
					array[j + step] = temp;
				}
			}
		}

		System.out.println("Результат: " + Arrays.toString(array));

	}

}

package by.epam.one_dimentional_arrays_sorting;

import java.util.Arrays;

public class Task05 {
	
	// 05. Сортировка вставками.
	// Дана последовательность. Отсортировать её по возрастанию.

	public static void main(String[] args) {
		int[] array = { 3, 5, 7, 6, 8, 1, 9, 2, 4 };
		System.out.println("Исходный массив: " + Arrays.toString(array));

		System.out.println();

		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && array[j-1] > array[j]; j--) {
				swap(array, j-1, j);
			}
		}
	
		System.out.println("Результат: " + Arrays.toString(array));
	
	}
	
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];			// метод замены элементов
		arr[index2] = temp;
	}
}

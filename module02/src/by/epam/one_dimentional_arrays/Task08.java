package by.epam.one_dimentional_arrays;

import java.util.Arrays;

public class Task08 {

	public static void main(String[] args) {
		// 08. Дана последовательность целых чисел a1, a2, ... an
		// Образовать новую последовательность, выбросив из исходной те элементы,
		// которые равны min(a1, a2, ... an)

		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Исходный массив: " + Arrays.toString(a));

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Минимальный элемент: " + min + ".");

		int[] b = new int[a.length - 1];

		int index = 0;
		for (int num : a) {
			if (num != min) {
				b[index++] = num;
			}
		}

		System.out.println("Новая поледовательность: " + Arrays.toString(b));

	}

}

package by.epam.one_dimentional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
	// 10. Дан целочисленный массив длиной n.
	// Сжать массив, выбросив из него каждый второй элемент
	// (освободившиеся элементы заполинть нулями). НЕЛЬЗЯ использовать
	// дополинтельный массив.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину массива n: ");

		int n = scanner.nextInt();

		scanner.close();

		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}

		System.out.println("Исходный массив: " + Arrays.toString(a));
		System.out.println(
				"Исходный массив после обработки (убрали каждый второй элемент): " + Arrays.toString(eraseElements(a)));

	}

	public static int[] eraseElements(int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				array[i] = 0;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == 0 && array[j] != 0) {
					array[i] = array[j];
					array[j] = 0;
				}
			}
		}

		return array;
	}

}

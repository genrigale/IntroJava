package by.epam.one_dimentional_arrays;

import java.util.Arrays;

public class Task05 {

	public static void main(String[] args) {
		// 05. Даны целые числа. Вывети на печать те числа, для которых a(i) > i

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((Math.random() * 20) - 5); // заполняем числами от -5 до 15
		}

		System.out.println("Исходный массив: " + Arrays.toString(arr));
		System.out.println();

		System.out.println("Элементы, индекс которых меньше их значения: ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > i) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}

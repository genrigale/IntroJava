package by.epam.one_dimentional_arrays_sorting;

import java.util.Arrays;

public class Task02 {
	// 2. Даны две последовательности (возрастающие). Образовать из них новую
	// последовательность чисел так, чтобы она тоже была неубывающей.

	public static void main(String[] args) {
		int[] first = new int[] { 6, 7, 8, 9, 10 };
		int[] second = new int[] { 1, 2, 3, 4, 5 };

		System.out.println("Первый массив: " + Arrays.toString(first));
		System.out.println("Второй массив: " + Arrays.toString(second));

		int[] result = new int[first.length + second.length];

		int index1 = 0;
		for (int i = 0; i < first.length; i++) {
			result[index1] = first[i];
			index1++;
		}

		int index2 = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0) {
				result[i] = second[index2];
				index2++;
			}
		}
		
		System.out.println("Промежуточный результат: " + Arrays.toString(result));

		for (int i = 0; i < result.length - 1; i++) {
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] > result[j]) {
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}

		System.out.println("Результат: " + Arrays.toString(result));

	}

}

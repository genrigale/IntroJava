package by.epam.one_dimentional_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task06 {

	public static void main(String[] args) {
		// 06. Задана поледовательность n вещественных чисел.
		// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

		// исходный массив из 10-ти вещественных чисел
		double[] array = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// ====================================================================
		// здесь применяем алгоритм "решето Эратосфена"
		// чтобы исключить среди индексов составные числа

		boolean[] isPrime = new boolean[array.length];
		Arrays.fill(isPrime, true);

		for (int i = 2; i < Math.sqrt(array.length); i++) {
			if (isPrime[i]) {
				for (int j = 2 * i; j < isPrime.length; j += i) {
					isPrime[j] = false;
				}
			}
		}

		// ====================================================================

		List<Integer> indexes = new ArrayList<>();

		for (int i = 2; i < isPrime.length; i++) {
			if (isPrime[i]) {
				indexes.add(i); // выделяем простые числа в отдельный список
			}
		}

		System.out.println("Индексы, которые являются простыми числами: " + indexes + ".");

		// суммируем значения элементов исходного массива, которые соответствуют
		// найденным "простым" индексам
		double sum = 0;
		for (int i = 0; i < indexes.size(); i++) {
			sum += array[indexes.get(i)];

		}

		System.out.println("Сумма элементов, порядковые номера которых являются простыми числами = " + sum + ".");
	}

}

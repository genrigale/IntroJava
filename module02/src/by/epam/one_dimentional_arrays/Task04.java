package by.epam.one_dimentional_arrays;

import java.util.Arrays;

public class Task04 {

	public static void main(String[] args) {
		// 04. Даны действительные числа. Поменять местами наибольший и наименьший
		// элементы.

		double[] array = new double[] { 1.1, 2.3, 0, 7.5, 11.4, 0.9, 3.4, 8.2, 9.0, 10.1 };
		System.out.println("Исходный массив: " + Arrays.toString(array));

		double min = array[0];
		int minIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}
		System.out.println("Наименьшее число = " + min + ". " + "Его индекс " + minIndex + ".");

		double max = array[0];
		int maxIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
		}
		System.out.println("Наибольшее число = " + max + ". " + "Его индекс " + maxIndex + ".");

		// замена
		double temp = array[minIndex];
		array[minIndex] = array[maxIndex];
		array[maxIndex] = temp;

		System.out.println("Исходный массив ПОСЛЕ ЗАМЕНЫ: " + Arrays.toString(array));

	}

}

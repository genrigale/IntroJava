package by.epam.one_dimentional_arrays;

public class Task01 {

	public static void main(String[] args) {
		// 01. В массив a[n] занесены натуральные числа.
		// Найти сумму тех элементов, которые кратны данному k.

		int sum = 0; // сумма
		int k = 5; // делитель
		int n = 100; // длина массива
		int[] array = new int[n]; // массив емкостью n-элементов

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1; // заполняем массив числами от 1 до 100
		}

		// элементы, которые без остатка делятся на k, суммируем
		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				sum += array[i];
			}
		}

		System.out.println("Сумма элементов массива, кратных числу " + k + " = " + sum + ".");

	}

}

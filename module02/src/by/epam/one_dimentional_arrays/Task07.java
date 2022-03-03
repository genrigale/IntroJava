package by.epam.one_dimentional_arrays;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// 07. Даны действительные числа a1....a2n
		// Найти max(a1 + a2n, a2 + a2n-1 ...)

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите длину массива n: ");
		int n = scanner.nextInt();

		scanner.close();

		if (n % 2 != 0) {
			System.out.println("Длина n должна быть четной!");
			return;
		}

		double[] arr = new double[n];

		for (int i = 0; i < arr.length; i++) { // заполним массив действительными числами от 0 до 15 (длина n)
			arr[i] = Math.random() * 15;
		}

		for (int i = 0; i < arr.length; i++) { // выводим массив
			System.out.println(arr[i]);
		}

		System.out.println();
		System.out.println("Максимальная сумма = " + maximumSum(arr)); // результат

	}

	public static double maximumSum(double[] arr) { // метод, который определяет максимальную сумму среди элементов

		// берем сумму первого и последнего элементов за эталон
		double max = arr[0] + arr[arr.length - 1];

		// выводим в консоль сумму первого и последнего элементов
		System.out.println(arr[0] + " + " + arr[arr.length - 1] + " = " + (arr[0] + arr[arr.length - 1]));

		// ДЛЯ НАГЛЯДНОСТИ выводим суммы элементов
		// (кроме первого и последнего - ОНА ВЫВЕДЕНА ВЫШЕ), двигаясь слева и справа к
		// середине ряда
		for (int i = 1; i < arr.length / 2; i++) {
			System.out.println(arr[i] + " + " + arr[arr.length - 1 - i] + " = " + (arr[i] + arr[arr.length - 1 - i]));
		}

		System.out.println();

		// здесь аналогичные действия, только теперь мы эти суммы сравниваем
		for (int i = 1; i < arr.length / 2; i++) {
			if ((arr[i] + arr[arr.length - 1 - i]) > max) {
				max = arr[i] + arr[arr.length - 1 - i];
			}
		}
		return max;
	}

}

package by.epam.loop;

import java.util.Scanner;

public class Task07 {

	// 07. Для каждого натурального числа в промежутке от m до n вывести все
	// делители, кроме 1 и самого числа. m и n вводятся с клавиатуры.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число m: ");
		int m = scanner.nextInt();
		System.out.println("Введите число n: ");
		int n = scanner.nextInt();
		
		scanner.close();

		if (m >= n) {
			System.out.println("Число m дложно быть меньше числа n! Попробуйте снова.");
			return;
		}

		System.out.println("Разберем диапазон от " + m + " до " + n + ".");
		
		for (int i = m; i <= n; i++) {
			for (int k = 2; k <= i - 1; k++) { // здесь перебираем делители от 2 до числа предстоящего исходному
												// (т.е. НЕ проверяем деление исходного числа на 0, 1 и само себя)
				if (i % k == 0) {
					System.out.println("Делитель числа " + i + ": " + k);
				}else if (i % k != 0) {
					System.out.println("Число " + i + " не делится без остатка на: " + k);
				}
			}
		}

	}

}

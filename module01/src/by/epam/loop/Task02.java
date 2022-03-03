package by.epam.loop;

import java.util.Scanner;

public class Task02 {

	// 02. Вычислить значение функции на отрезке [a,b] с шагом h.
	// y = x (x > 2)
	// y = -x (x <= 2)

	public static void main(String[] args) {
		int a, b, y, x, h;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите начало отрека: ");
		a = scanner.nextInt();
		System.out.println("Введите конец отрезка: ");
		b = scanner.nextInt();
		System.out.println("Введите шаг: ");
		h = scanner.nextInt();

		scanner.close();
		
		System.out.println("Значения функции y: ");

		for (x = a; x <= b; x += h) {
			if (x > 2) {
				y = x;
				System.out.println(y);
			} else {
				y = -x;
				System.out.println(y);
			}
		}

	}

}

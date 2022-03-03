package by.epam.loop;

public class Task05 {

	// 05. Даны числовой ряд и некоторое число e.
	// Найти сумму тех членов ряда, модуль которых больше или равен заданному e.
	// Общий член ряда имеет вид:
	// a = 1/2^n + 1/3^n

	public static void main(String[] args) {
		double e = 2;
		double a;
		double n = 3;
		double sum = 0;

		for (int i = 0; i < n; i++) {
			a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
			System.out.println(a); // выводим числовой ряд

			if (Math.abs(a) >= e) {
				sum += a;
			}
		}
		System.out.println("Сумма = " + sum);

	}

}

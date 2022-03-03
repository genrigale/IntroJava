package by.epam.branch;

public class Task01 {
	// 01. Даны два угла треугольника (в градусах).
	// Определить: существует ли такой треугольник (если да - является ли он
	// прямоугольным).

	public static void main(String[] args) {
		double c; // третий угол
		double sum = 180; // сумма всех углов треугольника

		double a = 45;
		double b = 90;

		c = sum - (a + b); // находим третий угол

		if (a + b + c == sum) {
			System.out.println("Треугольник существует.");
		} else {
			System.out.println("Треугольник не существует.");
		}

		if (a == 90 || b == 90 || c == 90) {
			System.out.println("Треугольник - прямоугольный.");
		} else {
			System.out.println("Треугольник не является прямоугольным.");
		}

	}

}

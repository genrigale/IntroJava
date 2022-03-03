package by.epam.decomposition;

public class Task01 {
	// 01. Написать методы для нахождения НОД и НОК двух натуральных чисел.
	// НОК(a,b) = (a*b) / НОД (a,b)

	public static void main(String[] args) {
		int a = 96, b = 72;

		int nod = findNOD(a, b);
		int nok = a * b / nod;

		System.out.println("НОД (" + a + ", " + b + ") = " + nod + ".");
		System.out.println("НОК (" + a + ", " + b + ") = " + nok + ".");

	}

	// функция поиска наибольшего общего делителя
	public static int findNOD(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		return a + b;
	}

}

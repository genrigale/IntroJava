package by.epam.branch;

public class Task02 {
	// 02. Найти max{min(a,b), min(c,d)}

	public static void main(String[] args) {

		// ВАРИАНТ 1

		// резервируем место для максимального и минимального числа
		int max;
		int min1;
		int min2;

		// дано
		int a = 2;
		int b = 47;
		int c = 52;
		int d = 112;

		// находим min1
		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}
		System.out.println("min1 = " + min1);

		// находим min2
		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}
		System.out.println("min2 = " + min2);

		// находим max среди min1 и min2
		if (min1 > min2) {
			max = min1;
		} else {
			max = min2;
		}
		System.out.println("max среди min1 и min2 = " + max);

		// ВАРИАНТ 2
//		double a = 2;
//		double b = 47;
//		double c = 52;
//		double d = 112;
//		
//		System.out.println(Math.max(Math.min(a, b), Math.min(c, d)));

	}

}

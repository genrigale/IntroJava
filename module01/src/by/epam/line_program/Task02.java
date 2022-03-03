package by.epam.line_program;

public class Task02 {
	// 02. Вычислить значение выражения (все поля - действительные числа):
	// b + Math.sqrt(Math.pow(b, 2) + 4*a*c) / 2*a - Math.pow(a, 3) * c + 1 / Math.pow(b, 2)

	public static void main(String[] args) {
		double result;
		double a = 4.0;
		double b = 4.0;
		double c = 4.0;

		result = (b + Math.sqrt(Math.pow(b, 2) + 4*a*c)) / 2*a - Math.pow(a, 3) * c + 1 / Math.pow(b, 2);

		System.out.println("Значение выражения = " + result);

	}

}

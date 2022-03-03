package by.epam.branch;

import java.util.Scanner;

public class Task05 {
	// 05. Вычислить значение функции:
	// x * x - 3 * x + 9, если x <= 3
	// 1 / (x * x * x + 6), если x > 3

	public static void main(String[] args) {
		double result;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число x: ");

		double x = scanner.nextDouble();
		
		scanner.close();
		
		if(x <= 3) {
			result = Math.pow(x, 2) - 3 * x + 9; 
		}else {
			result = 1 / (Math.pow(x, 3) + 6);
		}
		
		System.out.println("Ответ = " + result);

	}

}

package by.epam.loop;

public class Task08 {

	// 08. Даны два числа. Определить цифры, входящие в состав
	// как первого, так и второго числа.

	public static void main(String[] args) {
		int firstNumber = 12;
		int secondNumber = 1542;

		System.out.println("Цифры числа " + firstNumber + ":");
		for (char digit : String.valueOf(firstNumber).toCharArray()) {
			System.out.print(digit + " ");
		}

		System.out.println();
		System.out.println("========================================");

		System.out.println("Цифры числа " + secondNumber + ":");
		for (char digit : String.valueOf(secondNumber).toCharArray()) {
			System.out.print(digit + " ");
		}
	}

}

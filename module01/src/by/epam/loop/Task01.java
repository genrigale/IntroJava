package by.epam.loop;

import java.util.Scanner;

public class Task01 {
	
	// 01. Напишите программу где пользователь вводит любое целое положительное число,
	// а программа суммирует все числа от 1 до введенного пользователем числа.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите целое положительное число: ");
		int number = scanner.nextInt();
		
		scanner.close();
		
		if(number < 1) {
			System.out.println("Ошибка! Введите число от 1 и выше.");
			return;
		}
		
		int sum = 0;
		
		for(int i = 1; i < number; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		

	}

}

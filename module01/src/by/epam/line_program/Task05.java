package by.epam.line_program;

import java.util.Scanner;

public class Task05 {
	// 05. Дано натуральное число t (длительность прошедшего времени в секундах).
	// Вывести данное значение в часах, минутах и секундах в следующем виде:
	// HHч MMмин SSc

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите количество секунд: ");
		
		int t = scanner.nextInt(); // исходное количество секунд
		
		int HH; //часы
		int MM; //минуты
		int SS; //секунды
		
		HH = t / 3600;
		MM = (t - (HH * 3600)) / 60;
		SS = t - (HH * 3600) - (MM * 60);		
		
		System.out.println(HH+"ч "+MM+"мин "+SS+"с");
		
		scanner.close();

	}

}

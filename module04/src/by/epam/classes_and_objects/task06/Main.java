package by.epam.classes_and_objects.task06;

import java.util.Scanner;

public class Main {

	/*
	 * 6. Составьте описание класса для представления времени. Предусмотрте
	 * возможности установки времени и изменения его отдельных полей (час, минута,
	 * секунда) с проверкой допустимости вводимых значений. В случае недопустимых
	 * значений полей поле устанавливается в значение 0. Создать методы изменения
	 * времени на заданное количество часов, минут и секунд.
	 */

	public static void main(String[] args) {
		Logic logic = new Logic();

		Time time1 = new Time(12, 20, 45);
		Time time2 = new Time(12, 45, 33);

		System.out.println("Временная отметка time1: " + time1);
		System.out.println("Временная отметка time2: " + time2);
		System.out.println();
		System.out.println("Уменьшение time1 на time2 = " + logic.decreaseTime(time1, time2));
		System.out.println("Увеличение time1 на time2 = " + logic.increaseTime(time1, time2));

		System.out.println("=====================================================================");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите часы, минуты, секунды (форимат времени 24-часовой): ");
		int hours = scanner.nextInt();
		int minutes = scanner.nextInt();
		int seconds = scanner.nextInt();
		System.out.print("Вами введены значения:\n" + "\tчасы = " + hours + ";\n" + "\tминуты = " + minutes + ";\n"
				+ "\tсекунды = " + seconds + ".\n");

		System.out.println("Создаем временную отметку на основании введенных значений.");
		Time time3 = new Time(hours, minutes, seconds);
		System.out.println("Получилась временная отметка: " + time3);
		scanner.close();

		System.out.println("=====================================================================");

	}

}

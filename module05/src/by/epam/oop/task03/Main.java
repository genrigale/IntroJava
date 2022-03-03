package by.epam.oop.task03;

import java.util.Arrays;

public class Main {
	
	/*
	 * 03. Создать класс Календарь с внутренним классом, с помощью объектов которого
	 * можно хранить информацию о выходных и праздничных днях.
	 */

	public static void main(String[] args) {

		Calendar.Month march = new Calendar().new Month("March");

		Logic logic = new Logic();

		logic.fillMonthList(march); // заполнили месяц днями

		logic.setupHolidays(march); // определили праздники

		logic.setupWeekends(march); // определили выходные

		Calendar calendar = new Calendar(2022, Arrays.asList(march)); // календарь на 2022 год

		PrintDaysInfo printDaysInfo = new PrintDaysInfo();
		
		System.out.println("Список дней:");
		printDaysInfo.printAllDaysOfMonth(calendar, "March");
		System.out.println("=====================================================================");
		System.out.println("Список праздников:");
		printDaysInfo.printHolidayOfMonth(calendar, "March");
		System.out.println("=====================================================================");
		System.out.println("Список выходных:");
		printDaysInfo.printWeekendOfMonth(calendar, "March");

	}

}

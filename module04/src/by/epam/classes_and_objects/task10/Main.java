package by.epam.classes_and_objects.task10;

import java.text.ParseException;
import java.util.List;

import by.epam.classes_and_objects.task10.entity.Airline;
import by.epam.classes_and_objects.task10.entity.Airport;
import by.epam.classes_and_objects.task10.entity.Day;
import by.epam.classes_and_objects.task10.logic.Logic;
import by.epam.classes_and_objects.task10.view.OutputForList;

public class Main {

	/*
	 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Airline, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль.
	 * 
	 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни
	 * недели. Найти и вывести: a) список рейсов для заданного пункта назначения; b)
	 * список рейсов для заданного дня недели; c) список рейсов для заданного дня
	 * недели, время вылета для которых больше заданного.
	 */

	public static void main(String[] args) throws ParseException {
		Airport airport = new Airport();
		airport.getAirlines()
				.add(new Airline("Minsk", 815, "TY-154", Airline.getStringToDate().parse("06:31"), Day.FRIDAY));
		airport.getAirlines()
				.add(new Airline("Moscow", 141, "Boeng-747", Airline.getStringToDate().parse("14:45"), Day.MONDAY));
		airport.getAirlines()
				.add(new Airline("Amsterdam", 32, "TY-116", Airline.getStringToDate().parse("00:11"), Day.FRIDAY));
		airport.getAirlines()
				.add(new Airline("Oslo", 111, "A320", Airline.getStringToDate().parse("16:00"), Day.WEDNESDAY));
		airport.getAirlines()
				.add(new Airline("Toronto", 265, "A111", Airline.getStringToDate().parse("20:44"), Day.SUNDAY));
		airport.getAirlines()
				.add(new Airline("Oslo", 599, "A310", Airline.getStringToDate().parse("23:42"), Day.TUESDAY));
		airport.getAirlines()
				.add(new Airline("Mexico", 455, "TY-116", Airline.getStringToDate().parse("15:30"), Day.SUNDAY));
		airport.getAirlines()
				.add(new Airline("Vladivostok", 669, "A171", Airline.getStringToDate().parse("17:10"), Day.SUNDAY));
		airport.getAirlines()
				.add(new Airline("Berlin", 265, "F310", Airline.getStringToDate().parse("19:40"), Day.SUNDAY));

		System.out.println("Список рейсов:");
		OutputForList.printList(airport.getAirlines());

		System.out.println("=================================================================================");

		Logic logic = new Logic();

		List<Airline> airlinesListToDestinationPoint = logic.airlinesToDestinationPoint(airport, "Oslo");

		System.out.println("Список рейсов в заданный пункт назначения:");
		OutputForList.printList(airlinesListToDestinationPoint);

		System.out.println("=================================================================================");

		List<Airline> airlinesListAtSomeDayOfWeek = logic.airlinesAtSomeDayOfWeek(airport, Day.SUNDAY);

		System.out.println("Список рейсов в заданный день:");
		OutputForList.printList(airlinesListAtSomeDayOfWeek);

		System.out.println("=================================================================================");

		List<Airline> airlinesListAtSomeDayOfWeekAfterSomeTime = logic.airlinesAtSomeDayOfWeekAfterSomeTime(airport,
				Airline.getStringToDate().parse("17:00"), Day.SUNDAY);

		System.out.println("Список рейсов в заданный день, после заданного времени:");
		OutputForList.printList(airlinesListAtSomeDayOfWeekAfterSomeTime);

	}

}
